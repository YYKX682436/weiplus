package b15;

/* loaded from: classes9.dex */
public final class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f17126d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "paymsgid"), com.tencent.mm.protobuf.i.u(-1, "senderdigest"), com.tencent.mm.protobuf.i.u(-1, "receiverdigest"), com.tencent.mm.protobuf.i.u(-1, "sourceicon"), com.tencent.mm.protobuf.i.u(-1, "appid"), com.tencent.mm.protobuf.i.u(-1, "apppath"), com.tencent.mm.protobuf.i.u(-1, "appquery"), com.tencent.mm.protobuf.i.c(-1, "ishalfscreen"), com.tencent.mm.protobuf.i.c(-1, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT), com.tencent.mm.protobuf.i.h(-1, "heightpercent"), com.tencent.mm.protobuf.i.u(-1, "minversion"), com.tencent.mm.protobuf.i.u(-1, "animin"), com.tencent.mm.protobuf.i.u(-1, "animout"), com.tencent.mm.protobuf.i.u(-1, "extradata")});
        this.f17126d = appendAttrs;
        super.set__serialName("pocketmoney");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null, null, null, null, bool, bool, null, null, null, null, null});
    }

    public java.lang.String getSourceIcon() {
        return super.getString(this.f17126d + 3);
    }

    public void j(java.lang.String str) {
        super.set(this.f17126d + 0, str);
    }

    public void k(java.lang.String str) {
        super.set(this.f17126d + 3, str);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean processXmlValueUseCData(java.lang.Object r2, java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.o.g(r2, r0)
            java.lang.String r0 = "tagName"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "itemTagName"
            kotlin.jvm.internal.o.g(r4, r0)
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
            boolean r2 = super.processXmlValueUseCData(r2, r3, r4, r5)
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b15.b.processXmlValueUseCData(java.lang.Object, java.lang.String, java.lang.String, boolean):boolean");
    }
}
