package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes5.dex */
public final class f0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OppoLeakFixer", "fixOplusCursorFeedbackManagerLeak");
        jz5.g gVar = com.p314xaae8f345.mm.p849xbf8d97c1.h0.f150248b;
        try {
            java.lang.Object[] objArr = (java.lang.Object[]) ((jz5.n) com.p314xaae8f345.mm.p849xbf8d97c1.h0.f150248b).mo141623x754a37bb();
            int length = objArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    i17 = -1;
                    obj = null;
                    break;
                } else {
                    obj = objArr[i17];
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj != null ? obj.getClass().getName() : null, "android.widget.OplusCursorFeedbackManager")) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            if (obj == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OppoLeakFixer", "OplusCursorFeedbackManager instance not found");
            } else {
                if (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p849xbf8d97c1.h0.f150247a < java.util.concurrent.TimeUnit.MINUTES.toMillis(1L)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OppoLeakFixer", "skip for freq");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OppoLeakFixer", "fix Oplus leak");
                com.p314xaae8f345.mm.p849xbf8d97c1.h0.f150247a = java.lang.System.currentTimeMillis();
                ((java.lang.Object[]) ((jz5.n) com.p314xaae8f345.mm.p849xbf8d97c1.h0.f150248b).mo141623x754a37bb())[i17] = null;
            }
        } catch (java.lang.ClassNotFoundException e17) {
            oj.j.d("MicroMsg.OppoLeakFixer", e17, "", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException e18) {
            oj.j.d("MicroMsg.OppoLeakFixer", e18, "", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            oj.j.d("MicroMsg.OppoLeakFixer", th6, "", new java.lang.Object[0]);
        }
    }
}
