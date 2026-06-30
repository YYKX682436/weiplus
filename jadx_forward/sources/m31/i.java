package m31;

/* loaded from: classes9.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7 f404683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 f404684e;

    public i(com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7 activityC11164x65f4bfb7, com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3) {
        this.f404683d = activityC11164x65f4bfb7;
        this.f404684e = c11162xe78737a3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7 activityC11164x65f4bfb7 = this.f404683d;
        if (activityC11164x65f4bfb7.isFinishing()) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7.f153382n;
        com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = this.f404684e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSubscribeMsgManagerUI", "updateResult %d, isOpened: %b", java.lang.Integer.valueOf(c11162xe78737a3.f153369f.size()), java.lang.Boolean.valueOf(c11162xe78737a3.f153368e));
        com.p314xaae8f345.mm.p965xc41bc71e.ui.C11165x5b5212e8 c11165x5b5212e8 = activityC11164x65f4bfb7.f153388i;
        if (c11165x5b5212e8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subscribeMsgList");
            throw null;
        }
        c11165x5b5212e8.setVisibility(c11162xe78737a3.f153369f.isEmpty() ^ true ? 0 : 8);
        com.p314xaae8f345.mm.p965xc41bc71e.ui.C11165x5b5212e8 c11165x5b5212e82 = (com.p314xaae8f345.mm.p965xc41bc71e.ui.C11165x5b5212e8) activityC11164x65f4bfb7.findViewById(com.p314xaae8f345.mm.R.id.nra);
        if (c11165x5b5212e82 != null) {
            c11165x5b5212e82.setVisibility(0);
        }
        boolean z17 = c11162xe78737a3.f153368e;
        java.util.List<com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3> list = c11162xe78737a3.f153369f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = activityC11164x65f4bfb7.f153386g;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z17);
        }
        android.widget.LinearLayout linearLayout = activityC11164x65f4bfb7.f153389m;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ll");
            throw null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(activityC11164x65f4bfb7.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aki));
        sb6.append(',');
        sb6.append(z17 ? activityC11164x65f4bfb7.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.akg) : activityC11164x65f4bfb7.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.akd));
        linearLayout.setContentDescription(sb6.toString());
        m31.f fVar = activityC11164x65f4bfb7.f153385f;
        if (fVar != null) {
            java.lang.String value = activityC11164x65f4bfb7.f153384e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
            fVar.f404672i = value;
        }
        m31.f fVar2 = activityC11164x65f4bfb7.f153385f;
        if (fVar2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
            java.util.ArrayList arrayList = fVar2.f404667d;
            arrayList.clear();
            if (!list.isEmpty()) {
                java.util.Collections.sort(list, fVar2.f404671h);
                boolean z18 = false;
                boolean z19 = false;
                for (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 : list) {
                    if (c11159x8f55e6d3.f153353z == 1) {
                        if (!z19) {
                            arrayList.add(new m31.e(fVar2, fVar2.x(activityC11164x65f4bfb7, fVar2.f404670g)));
                            z19 = true;
                        }
                    } else if (!z18) {
                        arrayList.add(new m31.e(fVar2, fVar2.x(activityC11164x65f4bfb7, 0)));
                        z18 = true;
                    }
                    arrayList.add(new m31.c(fVar2, c11159x8f55e6d3));
                }
            }
        }
        activityC11164x65f4bfb7.U6(z17);
    }
}
