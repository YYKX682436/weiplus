package zm5;

/* loaded from: classes9.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.r0 f555782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f555783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f555784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f555785g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(zm5.r0 r0Var, n0.e5 e5Var, n0.e5 e5Var2, n0.e5 e5Var3) {
        super(1);
        this.f555782d = r0Var;
        this.f555783e = e5Var;
        this.f555784f = e5Var2;
        this.f555785g = e5Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        r6 = ((java.lang.Number) r2.f384366d).intValue();
        r2 = (com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) r2.f384367e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).aj(r4.m158354x19263085(), r2.f231013d, null) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
    
        r9 = r20.f555784f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (r6 == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        r10 = r4.m158354x19263085();
        r11 = new android.content.Intent(r4.m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p2776x373aa5.p2777x9d4bf30f.ActivityC22817xee829f99.class);
        r11.putExtra("KEY_IMAGE_CURRENT_INDEX", r6);
        r11.putParcelableArrayListExtra("KEY_IMAGE_DATA", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        if (r9.mo128745x754a37bb() == en5.d.f336906f) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        if (r4.O6().Z6(r1) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e9, code lost:
    
        r1 = new java.util.ArrayList();
        r1.add(r11);
        java.util.Collections.reverse(r1);
        yj0.a.d(r10, r1.toArray(), "com/tencent/mm/view/activity/ImageQueryMainUIC$initView$1$4", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        r10.startActivity((android.content.Intent) r1.get(0));
        yj0.a.f(r10, "com/tencent/mm/view/activity/ImageQueryMainUIC$initView$1$4", "invoke", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        r11.putExtra("KEY_IMAGE_KEY_WORDS", (java.lang.String) r20.f555785g.mo128745x754a37bb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0120, code lost:
    
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0126, code lost:
    
        if (aq.p.f94463b == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0128, code lost:
    
        r4 = new java.lang.StringBuilder("getMsgCreateTime >> ");
        r5 = r2.f231013d;
        r4.append(r5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryComposeOp", r4.toString());
        r1 = pt0.f0.f439742b1.n(r1, r5).mo78012x3fdd41df();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014a, code lost:
    
        f65.o.f341458n = r1;
        r1 = r9.mo128745x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, "<get-value>(...)");
        r1 = (en5.d) r1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReporter", "setMatchLogic >> type: " + r1);
        r1 = r1.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016c, code lost:
    
        if (r1 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x016e, code lost:
    
        if (r1 == 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0171, code lost:
    
        if (r1 != 2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0173, code lost:
    
        r7 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017b, code lost:
    
        throw new jz5.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017e, code lost:
    
        f65.o.f341460p = r7;
        f65.o.f341445a.c(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017c, code lost:
    
        r7 = 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0188, code lost:
    
        return jz5.f0.f384359a;
     */
    @Override // yz5.l
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo146xb9724478(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zm5.o0.mo146xb9724478(java.lang.Object):java.lang.Object");
    }
}
