package s5;

/* loaded from: classes14.dex */
public final class i implements s5.b {

    /* renamed from: b, reason: collision with root package name */
    public final t5.b f484560b = new t5.b();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.TreeMap f484561c = new java.util.TreeMap();

    public final void a(int i17) {
        java.util.TreeMap treeMap = this.f484561c;
        int intValue = ((java.lang.Number) kz5.c1.h(treeMap, java.lang.Integer.valueOf(i17))).intValue();
        if (intValue == 1) {
            treeMap.remove(java.lang.Integer.valueOf(i17));
        } else {
            treeMap.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(intValue - 1));
        }
    }

    public android.graphics.Bitmap b(int i17, int i18, android.graphics.Bitmap.Config config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        int i19 = i17 * i18 * (config == android.graphics.Bitmap.Config.ALPHA_8 ? 1 : (config == android.graphics.Bitmap.Config.RGB_565 || config == android.graphics.Bitmap.Config.ARGB_4444) ? 2 : (android.os.Build.VERSION.SDK_INT < 26 || config != android.graphics.Bitmap.Config.RGBA_F16) ? 4 : 8);
        java.lang.Integer num = (java.lang.Integer) this.f484561c.ceilingKey(java.lang.Integer.valueOf(i19));
        if (num != null) {
            if (!(num.intValue() <= i19 * 4)) {
                num = null;
            }
            if (num != null) {
                i19 = num.intValue();
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
        t5.b bVar = this.f484560b;
        java.util.HashMap hashMap = bVar.f497217b;
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new t5.a(valueOf);
            hashMap.put(valueOf, obj);
        }
        t5.a aVar = (t5.a) obj;
        t5.a aVar2 = aVar.f497214c;
        t5.a aVar3 = aVar.f497215d;
        aVar2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar3, "<set-?>");
        aVar2.f497215d = aVar3;
        t5.a aVar4 = aVar.f497215d;
        t5.a aVar5 = aVar.f497214c;
        aVar4.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar5, "<set-?>");
        aVar4.f497214c = aVar5;
        t5.a aVar6 = bVar.f497216a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar6, "<set-?>");
        aVar.f497214c = aVar6;
        t5.a aVar7 = aVar6.f497215d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar7, "<set-?>");
        aVar.f497215d = aVar7;
        aVar7.f497214c = aVar;
        t5.a aVar8 = aVar.f497214c;
        aVar8.getClass();
        aVar8.f497215d = aVar;
        java.util.List list = aVar.f497213b;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) (list != null ? kz5.h0.E(list) : null);
        if (bitmap != null) {
            a(i19);
            bitmap.reconfigure(i17, i18, config);
        }
        return bitmap;
    }

    public void c(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        int a17 = h6.a.a(bitmap);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(a17);
        t5.b bVar = this.f484560b;
        java.util.HashMap hashMap = bVar.f497217b;
        java.lang.Object obj = hashMap.get(valueOf);
        java.lang.Object obj2 = obj;
        if (obj == null) {
            t5.a aVar = new t5.a(valueOf);
            t5.a aVar2 = aVar.f497214c;
            t5.a aVar3 = aVar.f497215d;
            aVar2.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar3, "<set-?>");
            aVar2.f497215d = aVar3;
            t5.a aVar4 = aVar.f497215d;
            t5.a aVar5 = aVar.f497214c;
            aVar4.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar5, "<set-?>");
            aVar4.f497214c = aVar5;
            t5.a aVar6 = bVar.f497216a;
            t5.a aVar7 = aVar6.f497214c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar7, "<set-?>");
            aVar.f497214c = aVar7;
            aVar.f497215d = aVar6;
            aVar6.f497214c = aVar;
            t5.a aVar8 = aVar.f497214c;
            aVar8.getClass();
            aVar8.f497215d = aVar;
            hashMap.put(valueOf, aVar);
            obj2 = aVar;
        }
        t5.a aVar9 = (t5.a) obj2;
        java.util.List list = aVar9.f497213b;
        if (list == null) {
            list = new java.util.ArrayList();
            aVar9.f497213b = list;
        }
        list.add(bitmap);
        java.util.TreeMap treeMap = this.f484561c;
        java.lang.Integer num = (java.lang.Integer) treeMap.get(java.lang.Integer.valueOf(a17));
        treeMap.put(java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* renamed from: toString */
    public java.lang.String m163857x9616526c() {
        return "SizeStrategy: entries=" + this.f484560b + ", sizes=" + this.f484561c;
    }
}
