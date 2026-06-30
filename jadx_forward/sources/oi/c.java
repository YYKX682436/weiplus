package oi;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final oi.e f427077a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f427078b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f427079c;

    /* renamed from: d, reason: collision with root package name */
    public long f427080d;

    /* renamed from: e, reason: collision with root package name */
    public int f427081e;

    public c(oi.e eVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f427078b = arrayList;
        this.f427079c = new java.util.ArrayList();
        this.f427081e = 1;
        this.f427077a = eVar;
        arrayList.add(java.lang.Integer.valueOf(eVar.f427089b));
        a(eVar.f427093f);
        oi.b bVar = eVar.f427093f;
        if (bVar != null) {
            this.f427080d += bVar.b();
        }
    }

    public void a(oi.b bVar) {
        if (bVar == null) {
            return;
        }
        oi.d dVar = oi.d.TEXTURE;
        java.util.List list = this.f427079c;
        oi.d dVar2 = bVar.f427074j;
        if (dVar2 == dVar) {
            for (oi.a aVar : bVar.f427076l) {
                if (aVar != null) {
                    list.add(aVar.m151418x9616526c());
                }
            }
            return;
        }
        if (dVar2 == oi.d.BUFFER) {
            list.add("MemoryInfo{target=" + bVar.f427065a + ", id=" + bVar.f427069e + ", eglContextNativeHandle='" + bVar.f427070f + "', usage=" + bVar.f427071g + ", size=" + bVar.b() + '}');
            return;
        }
        if (dVar2 == oi.d.RENDER_BUFFERS) {
            list.add("MemoryInfo{target=" + bVar.f427065a + ", id=" + bVar.f427069e + ", eglContextNativeHandle='" + bVar.f427070f + "', internalFormat=" + bVar.f427066b + ", width=" + bVar.f427067c + ", height=" + bVar.f427068d + ", size=" + bVar.b() + '}');
        }
    }
}
