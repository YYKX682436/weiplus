package u56;

/* loaded from: classes16.dex */
public final class o implements p56.s {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f506371d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f506372e;

    public o(p56.s... sVarArr) {
        this.f506371d = new java.util.LinkedList(java.util.Arrays.asList(sVarArr));
    }

    public void a(p56.s sVar) {
        if (sVar.b()) {
            return;
        }
        if (!this.f506372e) {
            synchronized (this) {
                if (!this.f506372e) {
                    java.util.List list = this.f506371d;
                    if (list == null) {
                        list = new java.util.LinkedList();
                        this.f506371d = list;
                    }
                    list.add(sVar);
                    return;
                }
            }
        }
        sVar.c();
    }

    @Override // p56.s
    public boolean b() {
        return this.f506372e;
    }

    @Override // p56.s
    public void c() {
        if (this.f506372e) {
            return;
        }
        synchronized (this) {
            if (this.f506372e) {
                return;
            }
            this.f506372e = true;
            java.util.List list = this.f506371d;
            java.util.ArrayList arrayList = null;
            this.f506371d = null;
            if (list == null) {
                return;
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((p56.s) it.next()).c();
                } catch (java.lang.Throwable th6) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(th6);
                }
            }
            q56.f.a(arrayList);
        }
    }

    public o(p56.s sVar) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f506371d = linkedList;
        linkedList.add(sVar);
    }
}
