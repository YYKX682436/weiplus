package iw5;

/* loaded from: classes13.dex */
public abstract class i extends android.os.Binder implements android.os.IInterface {
    public i() {
        attachInterface(this, "com.tencent.wechat.zrpc.ext_channel.IAidlZChannel");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        iw5.n initCallback;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.wechat.zrpc.ext_channel.IAidlZChannel");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.wechat.zrpc.ext_channel.IAidlZChannel");
            return true;
        }
        if (i17 == 1) {
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            iw5.k callback = null;
            if (readStrongBinder == null) {
                initCallback = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.wechat.zrpc.ext_channel.IAidlZChannelInitCallback");
                initCallback = (queryLocalInterface == null || !(queryLocalInterface instanceof iw5.n)) ? new iw5.m(readStrongBinder) : (iw5.n) queryLocalInterface;
            }
            android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.tencent.wechat.zrpc.ext_channel.IAidlZChannelCallback");
                callback = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof iw5.k)) ? new iw5.j(readStrongBinder2) : (iw5.k) queryLocalInterface2;
            }
            jw5.b bVar = (jw5.b) this;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initCallback, "initCallback");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            bVar.f383882i = callback;
            boolean z17 = jw5.i.f383888c;
            java.lang.String bizName = bVar.f383877d;
            jw5.a aVar = new jw5.a(initCallback);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
            synchronized (jw5.i.f383889d) {
                java.util.HashMap hashMap = jw5.i.f383890e;
                if (hashMap.containsKey(bizName)) {
                    java.lang.String msg = "pushChannel ".concat(bizName);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
                    if (iw5.o.f376808a != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlZChannelServerFactory", msg);
                    }
                    com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.g) hashMap.get(bizName);
                    if (gVar != null) {
                        gVar.O0(new com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.b(bVar));
                    }
                    aVar.mo146xb9724478(java.lang.Boolean.TRUE);
                } else {
                    java.util.HashMap hashMap2 = jw5.i.f383891f;
                    if (hashMap2.containsKey(bizName)) {
                        java.lang.String msg2 = "pushChannel bizName " + bizName + " has exist";
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg2, "msg");
                        if (iw5.o.f376808a != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AidlZChannelServerFactory", msg2);
                        }
                        aVar.mo146xb9724478(java.lang.Boolean.FALSE);
                    } else {
                        java.lang.String msg3 = "pushChannel: waitingCallback not contains " + bizName + ", waiting";
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg3, "msg");
                        if (iw5.o.f376808a != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlZChannelServerFactory", msg3);
                        }
                        jw5.g gVar2 = new jw5.g(bizName);
                        ((android.os.Handler) ((jz5.n) jw5.i.f383892g).mo141623x754a37bb()).postDelayed(gVar2, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                        hashMap2.put(bizName, new jz5.o(bVar, gVar2, aVar));
                    }
                }
            }
            parcel2.writeNoException();
        } else if (i17 == 2) {
            byte[] data = parcel.createByteArray();
            jw5.b bVar2 = (jw5.b) this;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            synchronized (bVar2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g("send: " + data.length, "msg");
                if (bVar2.mo119689x23b734ff()) {
                    if (bVar2.f383880g) {
                        com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.c cVar = bVar2.f383879f;
                        if (cVar != null) {
                            cVar.Q(data, data.length);
                        }
                    } else {
                        if (iw5.o.f376808a != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AidlServerZChannel", "send: not ready");
                        }
                        ((java.util.ArrayList) bVar2.f383881h).add(data);
                    }
                } else if (iw5.o.f376808a != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AidlServerZChannel", "send: not connected");
                }
            }
            parcel2.writeNoException();
        } else if (i17 == 3) {
            ((jw5.b) this).mo119687x5a5ddf8();
            parcel2.writeNoException();
        } else {
            if (i17 != 4) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            boolean mo119689x23b734ff = ((jw5.b) this).mo119689x23b734ff();
            parcel2.writeNoException();
            parcel2.writeInt(mo119689x23b734ff ? 1 : 0);
        }
        return true;
    }
}
