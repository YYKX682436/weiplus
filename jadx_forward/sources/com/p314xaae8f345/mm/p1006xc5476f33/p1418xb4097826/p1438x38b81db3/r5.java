package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class r5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 f185976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 f185977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f185978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185979g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176, so2.z0 z0Var, in5.s0 s0Var) {
        super(1);
        this.f185976d = q6Var;
        this.f185977e = c15258xcd50c176;
        this.f185978f = z0Var;
        this.f185979g = s0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yw2.a0 a0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var = this.f185976d;
        if (q6Var.f185875g && !booleanValue) {
            this.f185977e.m61741xc3b64c0d(Integer.MAX_VALUE);
        }
        so2.z0 z0Var = this.f185978f;
        z0Var.F = booleanValue;
        boolean z17 = q6Var.f185875g;
        in5.s0 s0Var = this.f185979g;
        if (z17) {
            q6Var.v(s0Var, z0Var);
        }
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = q6Var.f185873e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = z0Var.E;
            if (booleanValue) {
                yw2.a0 a0Var2 = a7Var.f187749o;
                android.widget.FrameLayout p17 = a0Var2 != null ? a0Var2.p() : null;
                if (p17 != null) {
                    p17.setVisibility(0);
                }
                ec2.d e27 = zy2.ra.e2(nyVar, 0, 1, null);
                if (e27 != null) {
                    e27.a(new ec2.a(13, c14994x9b99c079.f66939xc8a07680, c14994x9b99c079.m59229xb5af1dd5()));
                }
            } else {
                yw2.a0 a0Var3 = a7Var.f187749o;
                android.widget.FrameLayout p18 = a0Var3 != null ? a0Var3.p() : null;
                if (p18 != null) {
                    p18.setVisibility(8);
                }
                ec2.d e28 = zy2.ra.e2(nyVar, 0, 1, null);
                if (e28 != null) {
                    e28.a(new ec2.a(5, c14994x9b99c079.f66939xc8a07680, c14994x9b99c079.m59229xb5af1dd5()));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var2 = a7Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 ? a7Var : null;
                if (a7Var2 != null && (a0Var = a7Var2.f187749o) != null) {
                    a0Var.s().y(false);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
