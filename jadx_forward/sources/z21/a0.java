package z21;

/* loaded from: classes12.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f551083a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f551084b;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.locks.ReadWriteLock f551086d = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.StringBuilder f551087e = new java.lang.StringBuilder();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f551088f = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashMap f551085c = new java.util.LinkedHashMap();

    public a0(java.lang.String str) {
        this.f551083a = str;
    }

    public java.lang.String a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortSentenceContainer", "createNewShortSentence");
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f551086d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).writeLock().lock();
        z21.z zVar = new z21.z(this);
        this.f551085c.put(zVar.f551235a, zVar);
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).writeLock().unlock();
        return zVar.f551235a;
    }

    public java.lang.String b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortSentenceContainer", "createNewShortSentenceWithVoiceId voiceId:%s", str);
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f551086d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).writeLock().lock();
        try {
            z21.z zVar = new z21.z(this);
            zVar.f551235a = str;
            this.f551085c.put(str, zVar);
            return zVar.f551235a;
        } finally {
            ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).writeLock().unlock();
        }
    }

    public void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortSentenceContainer", "cutShortSentence markEnd:%s", java.lang.Integer.valueOf(i17));
        if (i17 < 0) {
            throw new java.lang.IllegalStateException("splitShortSentence file mark less than zero. mark: " + i17);
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f551086d).readLock().lock();
        if (this.f551085c.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShortSentenceContainer", "splitShortSentence there is no last one");
            ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f551086d).readLock().unlock();
            return;
        }
        r1 = null;
        for (z21.z zVar : this.f551085c.values()) {
        }
        if (zVar == null) {
            throw new java.lang.IllegalStateException("splitShortSentence last info is null");
        }
        zVar.f551238d = i17;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f551086d).readLock().unlock();
    }

    public java.util.LinkedList d() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f551086d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().lock();
        for (z21.z zVar : this.f551085c.values()) {
            if (zVar.f551236b) {
                r45.du5 du5Var = new r45.du5();
                du5Var.f454289d = zVar.f551235a;
                du5Var.f454290e = true;
                linkedList.add(du5Var);
            }
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().unlock();
        return linkedList;
    }

    public java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f551086d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().lock();
        for (z21.z zVar : this.f551085c.values()) {
            if (zVar.f551236b) {
                arrayList.add(zVar.f551235a);
            }
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().unlock();
        return arrayList;
    }

    public java.util.LinkedList f() {
        java.util.LinkedList linkedList = this.f551088f;
        linkedList.clear();
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f551086d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().lock();
        java.util.Iterator it = this.f551085c.values().iterator();
        while (it.hasNext()) {
            java.util.LinkedList linkedList2 = ((z21.z) it.next()).f551243i;
            if (linkedList2 != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    r45.t44 t44Var = (r45.t44) it6.next();
                    linkedList.add(new z21.c(t44Var.f467673e, t44Var.f467672d));
                }
            }
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().unlock();
        return linkedList;
    }

    public boolean g() {
        java.util.concurrent.locks.ReadWriteLock readWriteLock = this.f551086d;
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().lock();
        java.util.LinkedHashMap linkedHashMap = this.f551085c;
        boolean z17 = true;
        if (linkedHashMap.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortSentenceContainer", "isAllRespEnd innerContainer.size() == 0");
            ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().unlock();
            return true;
        }
        java.util.Iterator it = linkedHashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            z21.z zVar = (z21.z) it.next();
            java.lang.String str = zVar.f551235a;
            if (!zVar.f551242h) {
                z17 = false;
                break;
            }
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock) readWriteLock).readLock().unlock();
        return z17;
    }

    public z21.z h(int i17) {
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f551086d).readLock().lock();
        z21.z zVar = null;
        if (this.f551085c.size() == 0) {
            ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f551086d).readLock().unlock();
            return null;
        }
        java.util.Iterator it = this.f551085c.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            z21.z zVar2 = (z21.z) it.next();
            int i18 = zVar2.f551238d;
            if (!zVar2.f551237c && i17 <= zVar2.f551238d) {
                zVar = zVar2;
                break;
            }
        }
        ((java.util.concurrent.locks.ReentrantReadWriteLock) this.f551086d).readLock().unlock();
        return zVar;
    }
}
