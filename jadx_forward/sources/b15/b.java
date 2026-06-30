package b15;

/* loaded from: classes9.dex */
public final class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f98659d;

    public b() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "paymsgid"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "senderdigest"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "receiverdigest"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "sourceicon"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "appid"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "apppath"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "appquery"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.c(-1, "ishalfscreen"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.c(-1, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63), com.p314xaae8f345.mm.p2495xc50a8b8b.i.h(-1, "heightpercent"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "minversion"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "animin"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "animout"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "extradata")});
        this.f98659d = mo75927x8ded05a8;
        super.m126741x8589bfe1("pocketmoney");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{null, null, null, null, null, null, null, bool, bool, null, null, null, null, null});
    }

    /* renamed from: getSourceIcon */
    public java.lang.String m9590xabfc4b2a() {
        return super.m75945x2fec8307(this.f98659d + 3);
    }

    public void j(java.lang.String str) {
        super.set(this.f98659d + 0, str);
    }

    public void k(java.lang.String str) {
        super.set(this.f98659d + 3, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r3.equals("extradata") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r3.equals("sourceicon") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r3.equals("paymsgid") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r3.equals("appquery") != false) goto L17;
     */
    @Override // e14.l
    /* renamed from: processXmlValueUseCData */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo9591x1c1437af(java.lang.Object r2, java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            java.lang.String r0 = "tagName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "itemTagName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1110827244: goto L34;
                case -252838982: goto L2b;
                case 1184484167: goto L22;
                case 1383092404: goto L19;
                default: goto L18;
            }
        L18:
            goto L40
        L19:
            java.lang.String r0 = "paymsgid"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3e
            goto L40
        L22:
            java.lang.String r0 = "appquery"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L40
            goto L3e
        L2b:
            java.lang.String r0 = "extradata"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3e
            goto L40
        L34:
            java.lang.String r0 = "sourceicon"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3e
            goto L40
        L3e:
            r2 = 1
            goto L44
        L40:
            boolean r2 = super.mo9591x1c1437af(r2, r3, r4, r5)
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b15.b.mo9591x1c1437af(java.lang.Object, java.lang.String, java.lang.String, boolean):boolean");
    }
}
