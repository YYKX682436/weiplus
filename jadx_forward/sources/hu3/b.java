package hu3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f366621a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f366622b;

    public final void a(int i17) {
        java.util.ArrayList arrayList = this.f366621a;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) kz5.n0.Z(arrayList);
        if (byteBuffer != null && byteBuffer.capacity() == i17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordTemplateCorePlugin", "checkInit size:" + i17);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.nio.ByteBuffer) it.next()).clear();
        }
        arrayList.clear();
        for (int i18 = 0; i18 < 6; i18++) {
            arrayList.add(java.nio.ByteBuffer.allocateDirect(i17));
        }
    }
}
