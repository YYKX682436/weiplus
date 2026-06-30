package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316;

/* loaded from: classes11.dex */
public final class k0 implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.o0 f235474a;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.o0 o0Var) {
        this.f235474a = o0Var;
    }

    @Override // lr3.a
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.o0 o0Var = this.f235474a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 c16924x6da766a4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4) o0Var.f392926h;
        if (c16924x6da766a4 != null && o0Var.f235492r.isEmpty()) {
            c16924x6da766a4.m67736x5db1c8a().a().performClick();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: sa5.d.f(android.view.View, float, int, long, long, yz5.a, int, java.lang.Object):void
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
        Caused by: java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1776)
        	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1751)
        	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:140)
        	at jadx.core.dex.instructions.args.SSAVar.use(SSAVar.java:133)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:92)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1109)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:113)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:72)
        	... 1 more
        */
    @Override // lr3.a
    public void b() {
        /*
            r12 = this;
            com.tencent.mm.plugin.profile.ui.mod.components.o0 r0 = r12.f235474a
            android.view.View r1 = r0.f392926h
            com.tencent.mm.plugin.profile.ui.widget.SayHiItemView r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4) r1
            if (r1 != 0) goto L9
            return
        L9:
            androidx.appcompat.app.AppCompatActivity r0 = r0.m158354x19263085()
            r2 = 2131165533(0x7f07015d, float:1.7945286E38)
            int r0 = i65.a.h(r0, r2)
            float r3 = (float) r0
            em.t3 r0 = r1.m67736x5db1c8a()
            android.widget.LinearLayout r1 = r0.f336354e
            if (r1 != 0) goto L2a
            android.view.View r1 = r0.f336350a
            r2 = 2131301682(0x7f091532, float:1.8221429E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f336354e = r1
        L2a:
            android.widget.LinearLayout r2 = r0.f336354e
            java.lang.String r0 = "getContactInfoModDecCon(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r0)
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 30
            r11 = 0
            sa5.d.f(r2, r3, r4, r5, r7, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.k0.b():void");
    }
}
