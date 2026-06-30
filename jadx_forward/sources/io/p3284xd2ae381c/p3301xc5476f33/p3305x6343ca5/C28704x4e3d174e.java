package io.p3284xd2ae381c.p3301xc5476f33.p3305x6343ca5;

/* renamed from: io.flutter.plugin.mouse.MouseCursorPlugin */
/* loaded from: classes15.dex */
public class C28704x4e3d174e {

    /* renamed from: systemCursorConstants */
    private static java.util.HashMap<java.lang.String, java.lang.Integer> f71738x980dc06a;

    /* renamed from: mView */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3305x6343ca5.C28704x4e3d174e.MouseCursorViewDelegate f71739x628b0b2;

    /* renamed from: mouseCursorChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848 f71740x54071c28;

    /* renamed from: io.flutter.plugin.mouse.MouseCursorPlugin$MouseCursorViewDelegate */
    /* loaded from: classes15.dex */
    public interface MouseCursorViewDelegate {
        /* renamed from: getSystemPointerIcon */
        android.view.PointerIcon mo137267xd51261f1(int i17);

        /* renamed from: setPointerIcon */
        void m138576x9e0a4294(android.view.PointerIcon pointerIcon);
    }

    public C28704x4e3d174e(io.p3284xd2ae381c.p3301xc5476f33.p3305x6343ca5.C28704x4e3d174e.MouseCursorViewDelegate mouseCursorViewDelegate, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848 c28660xc1cad848) {
        this.f71739x628b0b2 = mouseCursorViewDelegate;
        this.f71740x54071c28 = c28660xc1cad848;
        c28660xc1cad848.m138187x6b2b1e7(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848.MouseCursorMethodHandler() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.1
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28660xc1cad848.MouseCursorMethodHandler
            /* renamed from: activateSystemCursor */
            public void mo138189xb21726f8(java.lang.String str) {
                io.p3284xd2ae381c.p3301xc5476f33.p3305x6343ca5.C28704x4e3d174e.this.f71739x628b0b2.m138576x9e0a4294(io.p3284xd2ae381c.p3301xc5476f33.p3305x6343ca5.C28704x4e3d174e.this.m138574x12032671(str));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resolveSystemCursor */
    public android.view.PointerIcon m138574x12032671(java.lang.String str) {
        if (f71738x980dc06a == null) {
            f71738x980dc06a = new java.util.HashMap<java.lang.String, java.lang.Integer>() { // from class: io.flutter.plugin.mouse.MouseCursorPlugin.2

                /* renamed from: serialVersionUID */
                private static final long f71742x3a3ed56c = 1;

                {
                    put("alias", 1010);
                    put("allScroll", 1013);
                    put("basic", 1000);
                    put("cell", 1006);
                    put("click", 1002);
                    put("contextMenu", 1001);
                    put("copy", 1011);
                    put("forbidden", 1012);
                    put("grab", java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c));
                    put("grabbing", java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46405xe4de6fbf));
                    put("help", 1003);
                    put("move", 1013);
                    put(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc, 0);
                    put("noDrop", 1012);
                    put("precise", 1007);
                    put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, 1008);
                    put("resizeColumn", 1014);
                    put("resizeDown", 1015);
                    put("resizeUpLeft", 1016);
                    put("resizeDownRight", 1017);
                    put("resizeLeft", 1014);
                    put("resizeLeftRight", 1014);
                    put("resizeRight", 1014);
                    put("resizeRow", 1015);
                    put("resizeUp", 1015);
                    put("resizeUpDown", 1015);
                    put("resizeUpLeft", 1017);
                    put("resizeUpRight", 1016);
                    put("resizeUpLeftDownRight", 1017);
                    put("resizeUpRightDownLeft", 1016);
                    put("verticalText", 1009);
                    put("wait", 1004);
                    put("zoomIn", 1018);
                    put("zoomOut", java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46406xaf4081cb));
                }
            };
        }
        return this.f71739x628b0b2.mo137267xd51261f1(f71738x980dc06a.getOrDefault(str, 1000).intValue());
    }

    /* renamed from: destroy */
    public void m138575x5cd39ffa() {
        this.f71740x54071c28.m138187x6b2b1e7(null);
    }
}
