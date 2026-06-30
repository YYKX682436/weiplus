package yr3;

/* loaded from: classes11.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.o5 f546560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f546561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f546562f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f546563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.l5 f546564h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f546565i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f546566m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ wr3.m1 f546567n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ sr3.a f546568o;

    public t(r45.o5 o5Var, wr3.n0 n0Var, android.content.Context context, r45.s5 s5Var, r45.l5 l5Var, boolean z17, int i17, wr3.m1 m1Var, sr3.a aVar) {
        this.f546560d = o5Var;
        this.f546561e = n0Var;
        this.f546562f = context;
        this.f546563g = s5Var;
        this.f546564h = l5Var;
        this.f546565i = z17;
        this.f546566m = i17;
        this.f546567n = m1Var;
        this.f546568o = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        if ((r4.length() > 0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if ((r0.length() == 0) != false) goto L27;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r6 = r21
            java.lang.String r0 = "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$initJumpLogicInPicTab$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r22
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r21
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            r45.o5 r0 = r6.f546560d
            java.lang.String r1 = r0.f463450h
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "FeatureMsgUtil"
            java.lang.String r3 = "onClick initJumpLogicInPicTab url:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3, r1)
            wr3.n0 r1 = wr3.n0.f530375f
            wr3.m1 r3 = r6.f546567n
            yr3.w r7 = yr3.w.f546592a
            wr3.n0 r4 = r6.f546561e
            if (r4 == r1) goto L98
            wr3.n0 r1 = wr3.n0.f530379m
            if (r4 == r1) goto L98
            wr3.n0 r1 = wr3.n0.f530378i
            r5 = 1
            r8 = 0
            java.lang.String r9 = "ContentUrl"
            if (r4 != r1) goto L56
            java.lang.String r4 = r0.f463450h
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r9)
            int r4 = r4.length()
            if (r4 <= 0) goto L52
            r4 = r5
            goto L53
        L52:
            r4 = r8
        L53:
            if (r4 == 0) goto L56
            goto L98
        L56:
            wr3.n0 r11 = r6.f546561e
            wr3.n0 r4 = wr3.n0.f530376g
            if (r11 != r4) goto L6a
            android.content.Context r8 = r6.f546562f
            r45.s5 r9 = r6.f546563g
            r45.o5 r10 = r6.f546560d
            int r12 = r6.f546566m
            sr3.a r13 = r6.f546568o
            yr3.w.a(r7, r8, r9, r10, r11, r12, r13)
            goto Lba
        L6a:
            wr3.n0 r4 = wr3.n0.f530377h
            if (r11 == r4) goto L86
            if (r11 != r1) goto L80
            java.lang.String r0 = r0.f463450h
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r9)
            int r0 = r0.length()
            if (r0 != 0) goto L7c
            goto L7d
        L7c:
            r5 = r8
        L7d:
            if (r5 == 0) goto L80
            goto L86
        L80:
            java.lang.String r0 = "item click with unknown status"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            goto Lba
        L86:
            android.content.Context r8 = r6.f546562f
            r45.s5 r9 = r6.f546563g
            r45.o5 r10 = r6.f546560d
            wr3.n0 r11 = r6.f546561e
            int r12 = r6.f546566m
            java.lang.String r13 = r3.f530312n
            sr3.a r14 = r6.f546568o
            yr3.w.c(r7, r8, r9, r10, r11, r12, r13, r14)
            goto Lba
        L98:
            android.content.Context r8 = r6.f546562f
            r45.s5 r9 = r6.f546563g
            r45.o5 r10 = r6.f546560d
            r45.l5 r11 = r6.f546564h
            r12 = 0
            wr3.n0 r13 = r6.f546561e
            boolean r14 = r6.f546565i
            int r15 = r6.f546566m
            boolean r0 = r3.f530316r
            java.lang.String r1 = r3.f530312n
            long r2 = r3.f530315q
            sr3.a r4 = r6.f546568o
            r16 = r0
            r17 = r1
            r18 = r2
            r20 = r4
            yr3.w.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20)
        Lba:
            java.lang.String r0 = "onClick"
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeatureMsgUtil$initJumpLogicInPicTab$1"
            java.lang.String r3 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r2, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yr3.t.onClick(android.view.View):void");
    }
}
