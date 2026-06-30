package s74;

/* loaded from: classes4.dex */
public final class p4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f486025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f486026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f486027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f486028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f486029h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f486030i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var4, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var5, java.util.Map map) {
        super(1);
        this.f486025d = c0Var;
        this.f486026e = c0Var2;
        this.f486027f = c0Var3;
        this.f486028g = c0Var4;
        this.f486029h = c0Var5;
        this.f486030i = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r2.equals("hover-background-color") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r2.equals("hover-color") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (r2.equals("rotatey") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        r5.f486028g.f391645d = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r2.equals("rotatex") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        if (r2.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r2.equals("background-color") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004b, code lost:
    
        r5.f486025d.f391645d = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r2.equals("color") == false) goto L20;
     */
    @Override // yz5.l
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo146xb9724478(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processViewAnimation$2"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = "it"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r2)
            java.lang.String r2 = "name"
            java.lang.String r2 = r6.optString(r2)
            r3 = 0
            if (r2 == 0) goto L4f
            int r4 = r2.hashCode()
            switch(r4) {
                case -1659228270: goto L41;
                case -530654603: goto L37;
                case 94842723: goto L2e;
                case 605322756: goto L25;
                default: goto L24;
            }
        L24:
            goto L4f
        L25:
            java.lang.String r4 = "background-color"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L4b
            goto L4f
        L2e:
            java.lang.String r4 = "color"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L4b
            goto L4f
        L37:
            java.lang.String r4 = "hover-background-color"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L4f
            goto L4b
        L41:
            java.lang.String r4 = "hover-color"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L4b
            goto L4f
        L4b:
            kotlin.jvm.internal.c0 r4 = r5.f486025d
            r4.f391645d = r3
        L4f:
            java.lang.String r4 = "translatex"
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r4)
            if (r4 != 0) goto L61
            java.lang.String r4 = "translatey"
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r4)
            if (r4 == 0) goto L65
        L61:
            kotlin.jvm.internal.c0 r4 = r5.f486026e
            r4.f391645d = r3
        L65:
            java.lang.String r4 = "scalex"
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r4)
            if (r4 != 0) goto L77
            java.lang.String r4 = "scaley"
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r4)
            if (r4 == 0) goto L7b
        L77:
            kotlin.jvm.internal.c0 r4 = r5.f486027f
            r4.f391645d = r3
        L7b:
            if (r2 == 0) goto La7
            int r4 = r2.hashCode()
            switch(r4) {
                case -925180581: goto L99;
                case 1384173181: goto L8f;
                case 1384173182: goto L85;
                default: goto L84;
            }
        L84:
            goto La7
        L85:
            java.lang.String r4 = "rotatey"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto La7
            goto La3
        L8f:
            java.lang.String r4 = "rotatex"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto La3
            goto La7
        L99:
            java.lang.String r4 = "rotate"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto La3
            goto La7
        La3:
            kotlin.jvm.internal.c0 r4 = r5.f486028g
            r4.f391645d = r3
        La7:
            java.lang.String r4 = "alpha"
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r4)
            if (r4 == 0) goto Lb3
            kotlin.jvm.internal.c0 r4 = r5.f486029h
            r4.f391645d = r3
        Lb3:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            java.util.Map r3 = r5.f486030i
            r3.put(r2, r6)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            jz5.f0 r6 = jz5.f0.f384359a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.p4.mo146xb9724478(java.lang.Object):java.lang.Object");
    }
}
