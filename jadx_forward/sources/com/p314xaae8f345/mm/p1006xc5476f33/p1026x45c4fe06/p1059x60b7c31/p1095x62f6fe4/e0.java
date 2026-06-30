package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class e0 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f163311a;

    public e0(km5.b bVar) {
        this.f163311a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kz5.p0] */
    @Override // nf.j
    /* renamed from: onResult */
    public final void mo14598x57429edc(int i17, android.content.Intent intent) {
        km5.b bVar = this.f163311a;
        if (intent == null || i17 == 0) {
            bVar.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x.f163657a);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
        ?? r27 = kz5.p0.f395529d;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = r27;
        }
        arrayList.addAll(stringArrayListExtra);
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
        java.util.ArrayList<java.lang.String> arrayList2 = r27;
        if (stringArrayListExtra2 != null) {
            arrayList2 = stringArrayListExtra2;
        }
        arrayList.addAll(arrayList2);
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(new com.p314xaae8f345.mm.vfs.r6((java.lang.String) it.next()));
        }
        objArr[0] = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z(arrayList3, 1);
        bVar.c(objArr);
    }
}
