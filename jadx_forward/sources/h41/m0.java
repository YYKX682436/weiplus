package h41;

/* loaded from: classes11.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.o0 f360361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(h41.o0 o0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360361d = o0Var;
        this.f360362e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h41.m0(this.f360361d, this.f360362e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        h41.o0 o0Var = this.f360361d;
        boolean z17 = o0Var.f360378k;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "setEditingText: skip after released");
            return f0Var;
        }
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c55569 = o0Var.f360371b;
        if (c11205xa3c55569 != null) {
            java.lang.String content = this.f360362e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            java.lang.String str = c11205xa3c55569.f153790u;
            c11205xa3c55569.f153790u = content;
            c11205xa3c55569.m0().setText(content);
            if (content.length() > 0) {
                c11205xa3c55569.m0().setTextColor(c11205xa3c55569.m7460x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            }
            c11205xa3c55569.m0().post(new f41.p0(content.length() >= str.length(), c11205xa3c55569));
        }
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c555692 = o0Var.f360371b;
        if (c11205xa3c555692 != null) {
            android.view.View view = (android.view.View) ((jz5.n) c11205xa3c555692.f153784o).mo141623x754a37bb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/SendMsgCard", "showConfirmButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/open_voice_control/card/SendMsgCard", "showConfirmButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.LinearLayout) ((jz5.n) c11205xa3c555692.f153785p).mo141623x754a37bb()).setVisibility(0);
        }
        return f0Var;
    }
}
