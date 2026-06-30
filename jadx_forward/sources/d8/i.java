package d8;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f308436a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f308437b;

    public i() {
        java.util.HashMap hashMap = new java.util.HashMap(3);
        this.f308436a = hashMap;
        this.f308437b = new android.util.SparseArray();
        hashMap.put(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Native, new d8.f(this));
        hashMap.put(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Legacy, new d8.g(this));
        hashMap.put(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Undefined, new d8.h(this));
    }

    public final com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8 a(java.io.InputStream inputStream, android.graphics.Bitmap.Config config, f8.c cVar, java.util.Map map) {
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129 enumC1595xee8a129 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Native;
        if (((f8.b) map.get(enumC1595xee8a129)).a(inputStream, config, cVar)) {
            return ((f8.b) map.get(enumC1595xee8a129)).b();
        }
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129 enumC1595xee8a1292 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Legacy;
        return ((f8.b) map.get(enumC1595xee8a1292)).a(inputStream, config, cVar) ? ((f8.b) map.get(enumC1595xee8a1292)).b() : ((f8.b) map.get(com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Undefined)).b();
    }
}
