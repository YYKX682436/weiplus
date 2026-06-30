package aw3;

/* loaded from: classes10.dex */
public final class e implements l45.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer f14835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qc0.p1 f14836b;

    public e(com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer stickerEditorContainer, qc0.p1 p1Var) {
        this.f14835a = stickerEditorContainer;
        this.f14836b = p1Var;
    }

    public final void a(c01.s2 status, xk0.f fVar) {
        um.t currentItemCache;
        xk0.o k17;
        qc0.j2 j2Var;
        kotlin.jvm.internal.o.g(status, "status");
        if (!(fVar instanceof xk0.n)) {
            boolean z17 = fVar instanceof xk0.h;
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer stickerEditorContainer = this.f14835a;
        java.lang.String str = stickerEditorContainer.f156426d;
        status.toString();
        r0 = null;
        android.graphics.Bitmap bitmap = null;
        switch (status.ordinal()) {
            case 0:
                ym5.y5 y5Var = stickerEditorContainer.f156428f;
                if (y5Var != null) {
                    y5Var.i(false);
                }
                ym5.y5 y5Var2 = stickerEditorContainer.f156428f;
                if (y5Var2 != null && y5Var2.D) {
                    com.tencent.mars.xlog.Log.i(y5Var2.f463581x, "hideCurrentItemOnEditText: ");
                    xk0.f g17 = y5Var2.g();
                    if (g17 != null) {
                        l45.q presenter = y5Var2.getPresenter();
                        dl.f0 f0Var = presenter != null ? (dl.f0) ((l45.n) presenter).d(y5Var2.getTargetFeatureType()) : null;
                        um.g gVar = f0Var != null ? (um.g) f0Var.d() : null;
                        yk0.a aVar = g17 instanceof yk0.a ? (yk0.a) g17 : null;
                        if (aVar != null) {
                            aVar.E = false;
                        }
                        if (gVar != null) {
                            gVar.b(g17.q());
                        }
                        if (f0Var != null) {
                            f0Var.r();
                        }
                    }
                }
                j2Var = qc0.e2.f361379c;
                break;
            case 1:
                j2Var = qc0.f2.f361380c;
                break;
            case 2:
                qc0.j2 j2Var2 = qc0.g2.f361384c;
                currentItemCache = stickerEditorContainer.getCurrentItemCache();
                if (currentItemCache != null && (k17 = currentItemCache.k(true)) != null) {
                    bitmap = k17.p();
                }
                j2Var2.f361390a = bitmap;
                j2Var2.f361391b = stickerEditorContainer.e();
                j2Var = j2Var2;
                break;
            case 3:
                j2Var = qc0.h2.f361385c;
                break;
            case 4:
                j2Var = qc0.z1.f361457c;
                break;
            case 5:
                j2Var = qc0.a2.f361357c;
                break;
            case 6:
                j2Var = qc0.b2.f361358c;
                break;
            case 7:
                j2Var = qc0.t1.f361443c;
                break;
            case 8:
                j2Var = qc0.w1.f361452c;
                break;
            case 9:
                j2Var = qc0.v1.f361448c;
                break;
            case 10:
                j2Var = qc0.u1.f361447c;
                break;
            case 11:
                j2Var = qc0.q1.f361437c;
                break;
            case 12:
                j2Var = qc0.s1.f361442c;
                break;
            case 13:
                j2Var = qc0.r1.f361438c;
                break;
            case 14:
                j2Var = qc0.i2.f361389c;
                break;
            case 15:
                j2Var = qc0.c2.f361362c;
                break;
            case 16:
                j2Var = qc0.x1.f361453c;
                break;
            case 17:
                j2Var = qc0.y1.f361456c;
                break;
            case 18:
                j2Var = qc0.d2.f361375c;
                break;
            default:
                throw new jz5.j();
        }
        this.f14836b.f361433d.invoke(j2Var);
    }
}
