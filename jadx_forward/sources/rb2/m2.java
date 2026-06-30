package rb2;

/* loaded from: classes2.dex */
public final class m2 implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475223a;

    public m2(int i17, so2.y0 y0Var) {
        this.f475223a = y0Var;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        if (menuItem.getItemId() == 0) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, "long_press_add_to_my_sticker");
            aVar.Tj(view, 40, 1, false);
            jz5.l[] lVarArr = new jz5.l[6];
            so2.y0 y0Var = this.f475223a;
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(y0Var.f492236d.f68959xf9a02e3e));
            lVarArr[1] = new jz5.l("comment_id", pm0.v.u(y0Var.f492236d.t0()));
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = y0Var.f492247r;
            lVarArr[2] = new jz5.l("pid", interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42930x4f4a97c4() : null);
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = y0Var.f492247r;
            lVarArr[3] = new jz5.l("emoticon_activityid", interfaceC4987x84e327cb2 != null ? interfaceC4987x84e327cb2.S0() : null);
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb3 = y0Var.f492247r;
            lVarArr[4] = new jz5.l("emoticon_designerid", interfaceC4987x84e327cb3 != null ? interfaceC4987x84e327cb3.X0() : null);
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb4 = y0Var.f492247r;
            lVarArr[5] = new jz5.l("emoticon_md5", interfaceC4987x84e327cb4 != null ? interfaceC4987x84e327cb4.mo42933xb5885648() : null);
            aVar.gk(view, kz5.c1.k(lVarArr));
        }
    }
}
