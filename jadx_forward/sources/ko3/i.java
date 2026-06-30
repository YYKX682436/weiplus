package ko3;

/* loaded from: classes13.dex */
public final class i extends ko3.n {

    /* renamed from: f, reason: collision with root package name */
    public final ko3.t f391503f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f391504g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ko3.u f391505h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ko3.u uVar, java.lang.Object obj, android.os.IBinder iBinder) {
        super(uVar, iBinder);
        this.f391505h = uVar;
        this.f391503f = null;
        this.f391504g = null;
        try {
            this.f391504g = new java.lang.ref.WeakReference(obj);
            java.lang.String str = ko3.u.f391541n + "$Stub";
            android.util.LruCache lruCache = ko3.k0.f391513a;
            try {
                this.f391503f = new ko3.t(uVar, java.lang.Class.forName(str));
            } catch (java.lang.Throwable th6) {
                throw new ko3.j0(th6);
            }
        } catch (java.lang.Throwable th7) {
            ko3.u.d(uVar, th7);
        }
    }

    @Override // ko3.n, android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        ko3.s sVar;
        if (i17 < 1 || i17 > 16777215) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        if (this.f391503f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AED", "init failed, give up intercepting.");
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        if (this.f391504g.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AED", "lost viewRootImpl instance, give up intercepting.");
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        ko3.t tVar = this.f391503f;
        synchronized (tVar) {
            sVar = tVar.f391531e;
            if (sVar == null) {
                tVar.f391531e = new ko3.s(tVar, null);
                try {
                    android.os.IInterface iInterface = (android.os.IInterface) ko3.k0.b(tVar.f391530d, "asInterface", new java.lang.Class[]{android.os.IBinder.class}, tVar);
                    for (java.lang.Class<?> cls : tVar.f391530d.getInterfaces()) {
                        if (android.os.IInterface.class.isAssignableFrom(cls)) {
                            for (java.lang.reflect.Method method : cls.getDeclaredMethods()) {
                                if (!"asBinder".equals(method.getName())) {
                                    tVar.f391532f = method.getName();
                                    if (!method.isAccessible()) {
                                        method.setAccessible(true);
                                    }
                                    method.invoke(iInterface, tVar.a(method.getParameterTypes()));
                                }
                            }
                        }
                    }
                    sVar = tVar.f391531e;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AED", th6, "unexpected exception.", new java.lang.Object[0]);
                    ko3.u.d(tVar.f391533g, th6);
                    tVar.f391531e.clear();
                    throw null;
                }
            }
        }
        java.lang.String str = (java.lang.String) sVar.get(i17);
        try {
            parcel.enforceInterface(ko3.u.f391541n);
            if (ko3.u.f391546s.equals(str)) {
                parcel.readLong();
                if (parcel.readInt() != 0) {
                    android.graphics.Region.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f391505h.f391556c).put(readStrongBinder, java.lang.Integer.valueOf(parcel.readInt()));
            } else if (ko3.u.f391547t.equals(str)) {
                parcel.readLong();
                parcel.readInt();
                parcel.readInt();
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f391505h.f391556c).put(readStrongBinder2, java.lang.Integer.valueOf(parcel.readInt()));
            } else if (ko3.u.f391548u.equals(str)) {
                parcel.readLong();
                parcel.readString();
                if (parcel.readInt() != 0) {
                    android.graphics.Region.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                android.os.IBinder readStrongBinder3 = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f391505h.f391556c).put(readStrongBinder3, java.lang.Integer.valueOf(parcel.readInt()));
            } else if (ko3.u.f391549v.equals(str)) {
                parcel.readLong();
                parcel.readString();
                if (parcel.readInt() != 0) {
                    android.graphics.Region.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                android.os.IBinder readStrongBinder4 = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f391505h.f391556c).put(readStrongBinder4, java.lang.Integer.valueOf(parcel.readInt()));
            } else if (ko3.u.f391550w.equals(str)) {
                parcel.readLong();
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    android.graphics.Region.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                android.os.IBinder readStrongBinder5 = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f391505h.f391556c).put(readStrongBinder5, java.lang.Integer.valueOf(parcel.readInt()));
            } else if (ko3.u.f391551x.equals(str)) {
                parcel.readLong();
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    android.graphics.Region.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                android.os.IBinder readStrongBinder6 = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f391505h.f391556c).put(readStrongBinder6, java.lang.Integer.valueOf(parcel.readInt()));
            } else if (ko3.u.f391552y.equals(str)) {
                parcel.readLong();
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    android.os.Bundle.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                android.os.IBinder readStrongBinder7 = parcel.readStrongBinder();
                parcel.readInt();
                ((java.util.concurrent.ConcurrentHashMap) this.f391505h.f391556c).put(readStrongBinder7, java.lang.Integer.valueOf(parcel.readInt()));
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AED", th7, "unexpected exception.", new java.lang.Object[0]);
            ko3.u.d(this.f391505h, th7);
        }
        return super.onTransact(i17, parcel, parcel2, i18);
    }
}
