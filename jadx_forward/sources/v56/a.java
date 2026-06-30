package v56;

/* loaded from: classes14.dex */
public abstract class a extends java.util.AbstractQueue {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceArray f514901d;

    /* renamed from: e, reason: collision with root package name */
    public final int f514902e;

    public a(int i17) {
        int m163295xa94ca879 = rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6.C30123x260cfa.m163295xa94ca879(i17);
        this.f514902e = m163295xa94ca879 - 1;
        this.f514901d = new java.util.concurrent.atomic.AtomicReferenceArray(m163295xa94ca879);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (((v56.c) this).poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        throw new java.lang.UnsupportedOperationException();
    }
}
