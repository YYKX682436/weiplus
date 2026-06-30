package f0;

/* loaded from: classes14.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f339735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(f0.r1 r1Var) {
        super(1);
        this.f339735d = r1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        int i18;
        int i19;
        float f17 = -((java.lang.Number) obj).floatValue();
        f0.r1 r1Var = this.f339735d;
        if ((f17 >= 0.0f || r1Var.f339757r) && (f17 <= 0.0f || r1Var.f339756q)) {
            if (!(java.lang.Math.abs(r1Var.f339743d) <= 0.5f)) {
                throw new java.lang.IllegalStateException(("entered drag with non-zero pending scroll: " + r1Var.f339743d).toString());
            }
            float f18 = r1Var.f339743d + f17;
            r1Var.f339743d = f18;
            if (java.lang.Math.abs(f18) > 0.5f) {
                float f19 = r1Var.f339743d;
                s1.r1 r1Var2 = r1Var.f339752m;
                if (r1Var2 != null) {
                    ((u1.w) r1Var2).h();
                }
                boolean z17 = r1Var.f339748i;
                if (z17) {
                    float f27 = f19 - r1Var.f339743d;
                    if (z17) {
                        f0.l0 f28 = r1Var.f();
                        if (!f28.b().isEmpty()) {
                            boolean z18 = f27 < 0.0f;
                            if (z18) {
                                f0.q0 q0Var = (f0.q0) ((f0.k) kz5.n0.i0(f28.b()));
                                i17 = (r1Var.f339746g ? q0Var.f339723e : q0Var.f339724f) + 1;
                                i18 = ((f0.q0) ((f0.k) kz5.n0.i0(f28.b()))).f339721c + 1;
                            } else {
                                f0.q0 q0Var2 = (f0.q0) ((f0.k) kz5.n0.X(f28.b()));
                                i17 = (r1Var.f339746g ? q0Var2.f339723e : q0Var2.f339724f) - 1;
                                i18 = ((f0.q0) ((f0.k) kz5.n0.X(f28.b()))).f339721c - 1;
                            }
                            if (i17 != r1Var.f339749j) {
                                if (i18 >= 0 && i18 < f28.a()) {
                                    boolean z19 = r1Var.f339751l;
                                    o0.i iVar = r1Var.f339750k;
                                    if (z19 != z18 && (i19 = iVar.f423385f) > 0) {
                                        java.lang.Object[] objArr = iVar.f423383d;
                                        int i27 = 0;
                                        do {
                                            ((p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.t) objArr[i27]).mo7002xae7a2e7a();
                                            i27++;
                                        } while (i27 < i19);
                                    }
                                    r1Var.f339751l = z18;
                                    r1Var.f339749j = i17;
                                    iVar.e();
                                    java.util.List list = (java.util.List) r1Var.f339754o.mo146xb9724478(new f0.i2(i17));
                                    int size = list.size();
                                    for (int i28 = 0; i28 < size; i28++) {
                                        jz5.l lVar = (jz5.l) list.get(i28);
                                        iVar.b(r1Var.f339758s.a(((java.lang.Number) lVar.f384366d).intValue(), ((p2.c) lVar.f384367e).f432910a));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (java.lang.Math.abs(r1Var.f339743d) > 0.5f) {
                f17 -= r1Var.f339743d;
                r1Var.f339743d = 0.0f;
            }
        } else {
            f17 = 0.0f;
        }
        return java.lang.Float.valueOf(-f17);
    }
}
