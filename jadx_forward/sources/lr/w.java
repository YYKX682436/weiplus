package lr;

/* loaded from: classes15.dex */
public final class w extends lr.u {

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10440xb448ef38 f402129p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ lr.x f402130q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(lr.x r5, android.view.View r6) {
        /*
            r4 = this;
            java.lang.String r0 = "itemView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            r4.f402130q = r5
            lr.o0 r0 = r5.f402135f
            com.tencent.mm.emoji.panel.layout.SmileyLayoutManager r1 = new com.tencent.mm.emoji.panel.layout.SmileyLayoutManager
            android.content.Context r2 = r6.getContext()
            java.lang.String r3 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            lr.o0 r3 = r5.f402135f
            int r3 = r3.f402094b
            r1.<init>(r2, r3)
            r4.<init>(r5, r6, r0, r1)
            r0 = 2131303541(0x7f091c75, float:1.82252E38)
            android.view.View r6 = r6.findViewById(r0)
            java.lang.String r0 = "findViewById(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r0)
            com.tencent.mm.emoji.panel.SmileyPanelView r6 = (com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10440xb448ef38) r6
            r4.f402129p = r6
            com.tencent.mm.pluginsdk.ui.k0 r5 = r5.f402142p
            r6.m43705xedb9864c(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.w.<init>(lr.x, android.view.View):void");
    }

    @Override // lr.u
    public void j(ir.t0 groupModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupModel, "groupModel");
        super.j(groupModel);
        lr.x xVar = this.f402130q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f402138i, "smiley_log SmileyPanelGroupViewHolder onBind");
        com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10440xb448ef38 c10440xb448ef38 = this.f402129p;
        c10440xb448ef38.getClass();
        ir.h config = xVar.f402133d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        ir.h hVar = c10440xb448ef38.config;
        yz5.a listener = c10440xb448ef38.A;
        if (hVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
            hVar.f375394t.remove(listener);
        }
        c10440xb448ef38.config = config;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        config.f375394t.add(listener);
        ((kr.f) listener).mo152xb9724478();
    }

    @Override // lr.u
    public void k() {
        super.k();
        com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10440xb448ef38 c10440xb448ef38 = this.f402129p;
        ir.h hVar = c10440xb448ef38.config;
        if (hVar != null) {
            yz5.a listener = c10440xb448ef38.A;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
            hVar.f375394t.remove(listener);
        }
    }
}
