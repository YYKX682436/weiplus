package gm0;

/* loaded from: classes12.dex */
public final class p1 extends pq5.c implements gm0.o1 {
    public p1() {
        super(lm5.d.f401134b);
    }

    @Override // gm0.o1
    public void s() {
        java.util.LinkedList linkedList;
        synchronized (this) {
            linkedList = new java.util.LinkedList(this.f345714d);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            fm5.b bVar = (fm5.b) it.next();
            if (bVar != null) {
                ((gm0.o1) bVar.f345717e).s();
            }
        }
    }
}
