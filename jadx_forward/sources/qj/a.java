package qj;

/* loaded from: classes12.dex */
public class a implements wu5.j {
    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "SyncBarrierWatchDogPlus";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (qj.c.f445396g) {
            try {
                try {
                    java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
                } finally {
                    qj.c.f445396g = true;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("timerTask run error, message : %s", e17.getMessage());
            }
            if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SyncBarrierWatchDogPlus", "check Sync Barrier");
                android.os.MessageQueue queue = android.os.Looper.getMainLooper().getQueue();
                java.lang.reflect.Field declaredField = queue.getClass().getDeclaredField("mMessages");
                declaredField.setAccessible(true);
                android.os.Message message = (android.os.Message) declaredField.get(queue);
                if (message != null) {
                    try {
                        java.lang.String message2 = message.toString();
                        qj.c.f445393d = message2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SyncBarrierWatchDogPlus", "mMessage = %s", message2);
                    } catch (java.lang.Exception e18) {
                        qj.c.f445393d = "";
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SyncBarrierWatchDogPlus", "mMessage Exception e : " + e18.getMessage());
                    }
                    if (message.getWhen() - android.os.SystemClock.uptimeMillis() < -3000) {
                        if (message.getTarget() == null) {
                            int i17 = message.arg1;
                            if (i17 == qj.c.f445395f) {
                                return;
                            }
                            java.lang.String str2 = qj.c.f445393d;
                            if (str2 != null && str2.contains("barrier=")) {
                                qj.c.a(i17);
                                qj.c.f445395f = i17;
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SyncBarrierWatchDogPlus", "Maybe Happens Lag");
                        }
                    }
                }
            }
        }
    }
}
