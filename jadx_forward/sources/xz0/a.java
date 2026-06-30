package xz0;

/* loaded from: classes15.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz0.a f539702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f539703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz0.a aVar, java.lang.String str) {
        super(0);
        this.f539702d = aVar;
        this.f539703e = str;
    }

    /* JADX WARN: Finally extract failed */
    public static final boolean a(java.lang.String str, yz0.a aVar, java.lang.String str2, yz0.a aVar2) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock;
        int readHoldCount;
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock;
        boolean mo880xb970c2b9;
        yz0.b bVar = xz0.b.f539705b;
        java.lang.String field_mediaId = aVar2.f69132xaca5bdda;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
        int i17 = 0;
        if (bVar.D0(field_mediaId)) {
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = xz0.b.f539707d;
            readLock = reentrantReadWriteLock.readLock();
            readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i18 = 0; i18 < readHoldCount; i18++) {
                readLock.unlock();
            }
            writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                mo880xb970c2b9 = xz0.b.f539705b.J0(aVar2);
                while (i17 < readHoldCount) {
                    readLock.lock();
                    i17++;
                }
                writeLock.unlock();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaCacheLogic", str2 + " update " + mo880xb970c2b9 + " mediaId:" + str + " cache:" + aVar);
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        } else {
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock2 = xz0.b.f539707d;
            readLock = reentrantReadWriteLock2.readLock();
            readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int i19 = 0; i19 < readHoldCount; i19++) {
                readLock.unlock();
            }
            writeLock = reentrantReadWriteLock2.writeLock();
            writeLock.lock();
            try {
                mo880xb970c2b9 = xz0.b.f539705b.mo880xb970c2b9(aVar2);
                while (i17 < readHoldCount) {
                    readLock.lock();
                    i17++;
                }
                writeLock.unlock();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MediaCacheLogic", str2 + " insert " + mo880xb970c2b9 + " mediaId:" + str + " cache:" + aVar);
            } finally {
                while (i17 < readHoldCount) {
                    readLock.lock();
                    i17++;
                }
                writeLock.unlock();
            }
        }
        return mo880xb970c2b9;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f539703e;
        yz0.a aVar = this.f539702d;
        if (aVar != null) {
            a(str, aVar, "syncMemoryCacheToDB from cache", aVar);
        } else {
            yz0.a aVar2 = (yz0.a) xz0.b.f539706c.get(str);
            if (aVar2 != null) {
                a(str, aVar, "syncMemoryCacheToDB from id", aVar2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.MediaCacheLogic", "syncMemoryCacheToDB noting for cache mediaId:" + str + " cache:" + aVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
