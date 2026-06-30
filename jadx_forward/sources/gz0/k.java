package gz0;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dw3.o0 f359214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359216g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f359217h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f359218i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f359219m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359220n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, dw3.o0 o0Var, java.lang.String str2, java.lang.String str3, android.content.Context context, boolean z17, int i17, java.lang.String str4) {
        super(1);
        this.f359213d = str;
        this.f359214e = o0Var;
        this.f359215f = str2;
        this.f359216g = str3;
        this.f359217h = context;
        this.f359218i = z17;
        this.f359219m = i17;
        this.f359220n = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    @Override // yz5.l
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo146xb9724478(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r0 = 1
            java.lang.String r1 = "miaojiansheet"
            java.lang.String r2 = "SnsTemplate"
            if (r12 == 0) goto L17
            dx1.f r12 = dx1.g.f326022a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r12.i(r2, r1, r3)
            goto L21
        L17:
            dx1.f r12 = dx1.g.f326022a
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.i(r2, r1, r3)
        L21:
            r12 = 0
            java.lang.String r1 = r11.f359213d
            if (r1 == 0) goto L2e
            int r2 = r1.length()
            if (r2 != 0) goto L2d
            goto L2e
        L2d:
            r0 = r12
        L2e:
            java.lang.String r2 = ""
            if (r0 != 0) goto L8c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "&assetUris="
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = "&launchType="
            r0.append(r1)
            dw3.o0 r1 = r11.f359214e
            int r1 = r1.f325783d
            r0.append(r1)
            java.lang.String r1 = "&showTemplatesList=1"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r11.f359215f
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r2)
            if (r3 != 0) goto L6d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "&templateId="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
        L6d:
            java.lang.String r1 = r11.f359216g
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r2)
            if (r2 != 0) goto L8a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "&musicKey="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            goto L8c
        L8a:
            r7 = r0
            goto L8d
        L8c:
            r7 = r2
        L8d:
            android.content.Context r0 = r11.f359217h
            boolean r4 = r11.f359218i
            int r6 = r11.f359219m
            java.lang.String r5 = r11.f359220n
            if (r4 == 0) goto L9a
            r12 = 2131756091(0x7f10043b, float:1.914308E38)
        L9a:
            r1 = r12
            if (r4 == 0) goto La1
            r12 = 2131756315(0x7f10051b, float:1.9143534E38)
            goto La4
        La1:
            r12 = 2131769782(0x7f1039b6, float:1.9170848E38)
        La4:
            r2 = r12
            if (r4 == 0) goto Lab
            r12 = 2131756213(0x7f1004b5, float:1.9143327E38)
            goto Lae
        Lab:
            r12 = 2131769262(0x7f1037ae, float:1.9169794E38)
        Lae:
            r9 = 2131756003(0x7f1003e3, float:1.9142901E38)
            gz0.n r10 = new gz0.n
            r3 = r10
            r8 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            gz0.o r6 = gz0.o.f359228d
            r3 = r12
            r4 = r9
            r5 = r10
            db5.e1.j(r0, r1, r2, r3, r4, r5, r6)
            jz5.f0 r12 = jz5.f0.f384359a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gz0.k.mo146xb9724478(java.lang.Object):java.lang.Object");
    }
}
