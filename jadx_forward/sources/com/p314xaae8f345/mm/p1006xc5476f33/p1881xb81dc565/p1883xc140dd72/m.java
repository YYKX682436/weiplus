package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f231230f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c f231231g;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar, int i17, java.lang.String str, byte[] bArr) {
        this.f231231g = cVar;
        this.f231228d = i17;
        this.f231229e = str;
        this.f231230f = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar = this.f231231g;
        if (cVar.f231047a != null) {
            int i18 = this.f231228d;
            java.lang.String str = this.f231229e;
            if (i18 == 2) {
                i17 = org.p3343x72743996.net.InterfaceC29524x4f65168b.f73913x76158116;
            } else if (i18 == 3) {
                i17 = org.p3343x72743996.net.InterfaceC29524x4f65168b.f73904x1eea26f3;
            } else if (i18 == 4) {
                i17 = -500;
            } else if (i18 == 5) {
                i17 = org.p3343x72743996.net.InterfaceC29524x4f65168b.f74012x19a9deed;
            } else if (i18 == 15) {
                i17 = org.p3343x72743996.net.InterfaceC29524x4f65168b.f73946xa652ff20;
            } else if (i18 != 16) {
                switch (i18) {
                    case 8:
                        i17 = -600;
                        break;
                    case 9:
                        i17 = -1000;
                        break;
                    case 10:
                        i17 = -1100;
                        break;
                    case 11:
                        i17 = -1300;
                        byte[] bArr = this.f231230f;
                        if (bArr != 0 && bArr.length > 0) {
                            str = bArr;
                            break;
                        }
                        break;
                    default:
                        i17 = i18;
                        break;
                }
            } else {
                i17 = -100;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onErr errorcode:%d, errType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            cVar.f231047a.F(i17, str);
        }
    }
}
