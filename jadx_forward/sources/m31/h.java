package m31;

/* loaded from: classes9.dex */
public final class h implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7 f404680a;

    public h(com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7 activityC11164x65f4bfb7) {
        this.f404680a = activityC11164x65f4bfb7;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7 activityC11164x65f4bfb7 = this.f404680a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = activityC11164x65f4bfb7.f153386g;
        objArr[0] = viewOnClickListenerC22631x1cc07cc8 != null ? java.lang.Boolean.valueOf(viewOnClickListenerC22631x1cc07cc8.f292896x) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSubscribeMsgManagerUI", "SubscribeMsg onSwitchChanged %s", objArr);
        i31.a aVar = activityC11164x65f4bfb7.f153387h;
        if (aVar != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = activityC11164x65f4bfb7.f153386g;
            aVar.b(viewOnClickListenerC22631x1cc07cc82 != null ? viewOnClickListenerC22631x1cc07cc82.f292896x : false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc83 = activityC11164x65f4bfb7.f153386g;
        if (viewOnClickListenerC22631x1cc07cc83 != null && viewOnClickListenerC22631x1cc07cc83.f292896x) {
            activityC11164x65f4bfb7.U6(true);
            android.widget.LinearLayout linearLayout = activityC11164x65f4bfb7.f153389m;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ll");
                throw null;
            }
            linearLayout.setContentDescription(activityC11164x65f4bfb7.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aki) + ',' + activityC11164x65f4bfb7.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.akg));
            return;
        }
        activityC11164x65f4bfb7.U6(false);
        android.widget.LinearLayout linearLayout2 = activityC11164x65f4bfb7.f153389m;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ll");
            throw null;
        }
        linearLayout2.setContentDescription(activityC11164x65f4bfb7.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aki) + ',' + activityC11164x65f4bfb7.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.akd));
    }
}
