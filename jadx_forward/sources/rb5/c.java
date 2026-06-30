package rb5;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb5.l f475397d;

    public c(rb5.l lVar) {
        this.f475397d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        yn.e b17;
        rb5.l lVar = this.f475397d;
        lVar.f475430x = lVar.f475413d.mo78514x143f1b92().f290206u0;
        if (!lVar.f475420n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingCompat", "start chatting but last chatting does't be close!");
            lVar.b();
        }
        boolean isFinishing = lVar.f475413d.isFinishing();
        rb5.k kVar = rb5.k.ACTIVITY_PAUSE;
        if (!isFinishing) {
            if (!(lVar.f475426t == kVar) && lVar.f475420n) {
                lVar.f475420n = false;
                java.util.Iterator it = lVar.f475428v.iterator();
                while (it.hasNext()) {
                    ((wn.q) it.next()).G4();
                }
                android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", lVar.f475423q);
                putExtra.putExtra("Chat_Self", lVar.f475424r);
                android.os.Bundle bundle = lVar.f475425s;
                if (bundle != null) {
                    putExtra.putExtras(bundle);
                }
                putExtra.putExtra("img_gallery_enter_from_chatting_ui", true);
                java.lang.Class cls = lVar.f475432z;
                if (cls != null && !lVar.f475415f.f279685f.f542241c.f283495a.containsKey(cls) && (b17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d3.b(lVar.f475432z)) != null) {
                    lVar.f475415f.f279685f.z(lVar.f475432z, b17);
                }
                lVar.f475415f.m7436x8619eaa0().putAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(putExtra));
                rb5.l.a(lVar, false);
                android.view.View m7474xfb86a31b = lVar.f475415f.m7474xfb86a31b();
                (m7474xfb86a31b != null ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba) m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.bkb) : null).m79277x8880a9f7(lVar.B);
                lVar.f475418i.setTranslationX((lVar.d().getDecorView().getWidth() == 0 ? lVar.f475413d.getResources().getDisplayMetrics().widthPixels : lVar.d().getDecorView().getWidth()) - 0.1f);
                lVar.f475418i.setVisibility(0);
                al5.a3.d(lVar);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChattingCompat", "[startChattingRunnable] pass! isPause:%s mChattingClosed:%s", java.lang.Boolean.valueOf(lVar.f475426t == kVar), java.lang.Boolean.valueOf(lVar.f475420n));
        lVar.f475422p = true;
    }
}
