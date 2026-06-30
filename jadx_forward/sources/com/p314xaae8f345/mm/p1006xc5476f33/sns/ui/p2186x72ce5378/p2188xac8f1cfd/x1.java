package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f250587a;

    /* renamed from: b, reason: collision with root package name */
    public final int f250588b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f250589c;

    public x1(int i17, int i18, java.util.ArrayList snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        this.f250587a = i17;
        this.f250588b = i18;
        this.f250589c = snapshot;
    }

    public final java.util.ArrayList a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnapshot", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnapshot", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        return this.f250589c;
    }

    /* renamed from: equals */
    public boolean m70962xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x1 x1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x1) obj;
        if (this.f250587a != x1Var.f250587a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            return false;
        }
        if (this.f250588b != x1Var.f250588b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            return false;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f250589c, x1Var.f250589c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        return b17;
    }

    /* renamed from: hashCode */
    public int m70963x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        int hashCode = (((java.lang.Integer.hashCode(this.f250587a) * 31) + java.lang.Integer.hashCode(this.f250588b)) * 31) + this.f250589c.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m70964x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        java.lang.String str = "ImproveSnapshotStruct(firstVisiblePosition=" + this.f250587a + ", lastVisiblePosition=" + this.f250588b + ", snapshot=" + this.f250589c + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
        return str;
    }
}
