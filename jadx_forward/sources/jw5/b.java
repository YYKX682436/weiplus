package jw5;

/* loaded from: classes13.dex */
public final class b extends iw5.i implements com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f383877d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f383878e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.c f383879f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f383880g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f383881h;

    /* renamed from: i, reason: collision with root package name */
    public iw5.k f383882i;

    public b(java.lang.String bizName, java.lang.String extra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        this.f383877d = bizName;
        this.f383878e = extra;
        this.f383881h = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d
    /* renamed from: close */
    public void mo119687x5a5ddf8() {
        synchronized (this) {
            if (this.f383882i == null) {
                if (iw5.o.f376808a != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AidlServerZChannel", "close: aidlCallback already null");
                }
                return;
            }
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlServerZChannel", "close");
            }
            this.f383882i = null;
            com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.c cVar = this.f383879f;
            if (cVar != null) {
                cVar.Q(new byte[0], -1);
            }
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d
    public void e() {
        if (iw5.o.f376808a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlServerZChannel", "ready");
        }
        synchronized (this) {
            if (!this.f383880g) {
                this.f383880g = true;
                for (byte[] bArr : this.f383881h) {
                    com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.c cVar = this.f383879f;
                    if (cVar != null) {
                        cVar.Q(bArr, bArr.length);
                    }
                }
                ((java.util.ArrayList) this.f383881h).clear();
            }
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d
    /* renamed from: getExtra */
    public java.lang.String mo119688x74653a5a() {
        return this.f383878e;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d
    /* renamed from: isConnected */
    public boolean mo119689x23b734ff() {
        return this.f383882i != null;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d
    public void j() {
        mo119687x5a5ddf8();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d
    public int k() {
        return 0;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d
    public void l(com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.c cVar) {
        this.f383879f = cVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d
    public void p(long j17, byte[] data, long j18) {
        java.util.Collection collection;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.c cVar = this.f383879f;
        iw5.k kVar = this.f383882i;
        if (kVar == null) {
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AidlServerZChannel", "sendAsync: aidlCallback is null 2");
            }
            if (cVar != null) {
                cVar.R(j17, false);
                return;
            }
            return;
        }
        if (cVar == null) {
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AidlServerZChannel", "sendAsync: zidlCallback is null");
                return;
            }
            return;
        }
        int i17 = (int) j18;
        if (data.length != i17) {
            if (!(i17 >= 0)) {
                throw new java.lang.IllegalArgumentException(("Requested element count " + i17 + " is less than zero.").toString());
            }
            if (i17 == 0) {
                collection = kz5.p0.f395529d;
            } else if (i17 >= data.length) {
                collection = kz5.z.v0(data);
            } else if (i17 == 1) {
                collection = kz5.b0.c(java.lang.Byte.valueOf(data[0]));
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(i17);
                int i18 = 0;
                for (byte b17 : data) {
                    arrayList.add(java.lang.Byte.valueOf(b17));
                    i18++;
                    if (i18 == i17) {
                        break;
                    }
                }
                collection = arrayList;
            }
            data = kz5.n0.N0(collection);
        }
        try {
            iw5.j jVar = (iw5.j) kVar;
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.tencent.wechat.zrpc.ext_channel.IAidlZChannelCallback");
                obtain.writeByteArray(data);
                jVar.f376806d.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                obtain2.recycle();
                obtain.recycle();
                cVar.R(j17, true);
            } catch (java.lang.Throwable th6) {
                obtain2.recycle();
                obtain.recycle();
                throw th6;
            }
        } catch (java.lang.Exception e17) {
            java.lang.String msg = "sendAsync error " + e17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AidlServerZChannel", msg);
            }
            cVar.R(j17, false);
            mo119687x5a5ddf8();
        }
    }
}
