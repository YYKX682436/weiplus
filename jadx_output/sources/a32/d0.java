package a32;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView f1010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView) {
        super(0);
        this.f1010d = editorStickerView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = this.f1010d;
        t85.d x17 = editorStickerView.f98669g.x(editorStickerView.f98670h);
        if (x17 != null) {
            u22.l lVar = u22.r.f424006p;
            r45.p64 p64Var = x17.f416456a;
            if (lVar.a(p64Var)) {
                v85.e eVar = v85.e.f434103a;
                r45.q64 q64Var = v85.e.f434108f;
                java.util.LinkedList lensInfoList = q64Var.f383710d;
                kotlin.jvm.internal.o.f(lensInfoList, "lensInfoList");
                java.util.Iterator it = lensInfoList.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(((r45.p64) it.next()).f382792d, p64Var.f382792d)) {
                        break;
                    }
                    i17++;
                }
                java.util.LinkedList linkedList = q64Var.f383710d;
                if (i17 >= 0 && i17 < linkedList.size()) {
                    linkedList.remove(i17);
                }
                linkedList.add(0, p64Var);
                if (linkedList.size() > 4) {
                    linkedList.remove(linkedList.size() - 1);
                }
                eVar.b();
            }
        }
        return jz5.f0.f302826a;
    }
}
