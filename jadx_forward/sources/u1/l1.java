package u1;

/* loaded from: classes14.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final o0.i f505152a = new o0.i(new u1.w[16], 0);

    public final void a(u1.w wVar) {
        o0.i iVar;
        int i17;
        int i18 = 0;
        if (wVar.f505224o == u1.c0.Idle && !wVar.Y && !wVar.X && wVar.A && (iVar = wVar.U) != null && (i17 = iVar.f423385f) > 0) {
            java.lang.Object[] objArr = iVar.f423383d;
            int i19 = 0;
            do {
                jz5.l lVar = (jz5.l) objArr[i19];
                ((s1.f1) lVar.f384367e).l((s1.z) lVar.f384366d);
                i19++;
            } while (i19 < i17);
        }
        wVar.V = false;
        o0.i r17 = wVar.r();
        int i27 = r17.f423385f;
        if (i27 > 0) {
            java.lang.Object[] objArr2 = r17.f423383d;
            do {
                a((u1.w) objArr2[i18]);
                i18++;
            } while (i18 < i27);
        }
    }
}
