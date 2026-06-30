package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public abstract class b implements com.p314xaae8f345.mm.p2614xca6eae71.c1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2614xca6eae71.a1 f274749a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f274750b;

    public b(int i17) {
        this.f274750b = new android.util.SparseArray(i17);
    }

    public abstract com.p314xaae8f345.mm.p2614xca6eae71.b a();

    public void b(com.p314xaae8f345.mm.p2614xca6eae71.a1 item, int i17, yz5.a nodeCreator) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nodeCreator, "nodeCreator");
        if (i17 >= 0 && i17 < item.a().length) {
            int i18 = item.a()[i17];
            synchronized (this.f274750b) {
                obj = (com.p314xaae8f345.mm.p2614xca6eae71.c1) this.f274750b.get(i18);
            }
            if (obj == null) {
                obj = nodeCreator.mo152xb9724478();
                synchronized (this.f274750b) {
                    this.f274750b.put(i18, obj);
                }
            }
            if (item.a().length - 1 > i17) {
                ((com.p314xaae8f345.mm.p2614xca6eae71.b) ((com.p314xaae8f345.mm.p2614xca6eae71.c1) obj)).b(item, i17 + 1, nodeCreator);
            } else {
                ((com.p314xaae8f345.mm.p2614xca6eae71.b) ((com.p314xaae8f345.mm.p2614xca6eae71.c1) obj)).f274749a = item;
            }
        }
    }

    public /* synthetic */ b(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 1 : i17);
    }
}
