package cl4;

/* loaded from: classes11.dex */
public final class l extends jk3.v {
    public static void c0(cl4.l lVar, bw5.v70 listenItem, boolean z17, boolean z18, android.graphics.Rect rect, android.graphics.Bitmap bitmap, boolean z19, int i17, java.lang.Object obj) {
        r45.lr4 v07;
        ak3.c cVar;
        if ((i17 & 32) != 0) {
            z19 = false;
        }
        lVar.getClass();
        kotlin.jvm.internal.o.g(listenItem, "listenItem");
        lVar.y(z18 ? 23 : 24, listenItem.getListenId());
        if (rect != null && bitmap != null && (cVar = lVar.f300111d) != null) {
            ((ak3.i) cVar).s(rect, bitmap);
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = lVar.f300077a;
        if (multiTaskInfo != null) {
            bw5.zo0 zo0Var = new bw5.zo0();
            zo0Var.f36074d = listenItem;
            zo0Var.f36075e[1] = true;
            multiTaskInfo.field_data = zo0Var.toByteArray();
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = lVar.f300077a;
        if (multiTaskInfo2 != null && (v07 = multiTaskInfo2.v0()) != null) {
            v07.set(1, listenItem.getTitle());
            v07.set(0, listenItem.c());
            v07.set(5, listenItem.d().b());
            v07.set(2, listenItem.f());
        }
        lVar.V(!z17, z19 ? 8 : 9, jk3.c.f300081e);
    }
}
