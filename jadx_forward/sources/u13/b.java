package u13;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f505287d = 0;

    public b(u13.c cVar, u13.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f505287d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f505287d;
        this.f505287d = i17 + 1;
        if (i17 == 0) {
            return n04.k.INSTANCE;
        }
        if (i17 == 1) {
            return n04.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
