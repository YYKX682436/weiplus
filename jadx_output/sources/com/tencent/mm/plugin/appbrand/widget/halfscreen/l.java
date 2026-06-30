package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.widget.halfscreen.l f91191d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.widget.halfscreen.l f91192e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.l[] f91193f;

    static {
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l lVar = new com.tencent.mm.plugin.appbrand.widget.halfscreen.l("DRAG_STATE_IDLE", 0);
        f91191d = lVar;
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l lVar2 = new com.tencent.mm.plugin.appbrand.widget.halfscreen.l("DRAG_STATE_DRAGGING", 1);
        f91192e = lVar2;
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l[] lVarArr = {lVar, lVar2};
        f91193f = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.appbrand.widget.halfscreen.l valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.widget.halfscreen.l) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.widget.halfscreen.l.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.widget.halfscreen.l[] values() {
        return (com.tencent.mm.plugin.appbrand.widget.halfscreen.l[]) f91193f.clone();
    }
}
