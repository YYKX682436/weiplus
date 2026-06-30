package ye5;

/* loaded from: classes8.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f542805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yb5.d dVar, java.lang.String str) {
        super(0);
        this.f542805d = dVar;
        this.f542806e = str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x002d: INVOKE (r0v6 ?? I:java.util.Map), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        /*
            r9 = this;
            yb5.d r0 = r9.f542805d
            com.tencent.mm.ui.chatting.manager.c r0 = r0.f542241c
            java.lang.Class<sb5.b0> r1 = sb5.b0.class
            yn.e r0 = r0.a(r1)
            sb5.b0 r0 = (sb5.b0) r0
            com.tencent.mm.ui.chatting.component.v4 r0 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4) r0
            r0.getClass()
            java.lang.String r7 = r9.f542806e
            java.lang.String r1 = "groupId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r1)
            java.util.Map r0 = r0.f281647f
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r1 = r0.get(r7)
            if (r1 != 0) goto L30
            com.tencent.mm.ui.chatting.component.p4 r8 = new com.tencent.mm.ui.chatting.component.p4
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.put(r7, r8)
        L30:
            com.tencent.mm.ui.chatting.component.p4 r1 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4) r1
            int r0 = r1.f281207c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ye5.m.mo152xb9724478():java.lang.Object");
    }
}
