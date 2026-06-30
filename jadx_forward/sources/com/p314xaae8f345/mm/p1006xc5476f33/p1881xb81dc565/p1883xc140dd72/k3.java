package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d80 f231208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u3 f231209e;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u3 u3Var, r45.d80 d80Var) {
        this.f231209e = u3Var;
        this.f231208d = d80Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u3 u3Var = this.f231209e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar = u3Var.f231365c.Y;
        java.lang.String str2 = u3Var.f231363a;
        cVar.getClass();
        dm.f8 O7 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Vi().O7(str2);
        if (O7 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "getMultiTalkBannerCreator, roomid:" + O7.f66526xeabee3b + " wxgroupid:" + str2 + ", creatorName:" + O7.f66524x922cf104);
            str = O7.f66524x922cf104;
        } else {
            str = null;
        }
        r45.d80 d80Var = this.f231208d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "join success, imroomid:%d, roomid:%d, selfmemberid:%d, createName:%s", java.lang.Long.valueOf(d80Var.f453749d), java.lang.Long.valueOf(d80Var.f453750e), java.lang.Integer.valueOf(d80Var.f453752g), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = u3Var.f231365c;
        i4Var.f231170n = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var = i4Var.f231156f;
        c0Var.f231052c = d80Var.f453749d;
        c0Var.f231051b = d80Var.f453750e;
        c0Var.f231055f = str;
        c0Var.f231057h = u3Var.f231364b;
        c0Var.f231053d = u3Var.f231363a;
        c0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = u3Var.f231365c;
        i4Var2.f231171n2 = true;
        if (i4Var2.f231169m2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "steve: join success! launch activity first!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var3 = u3Var.f231365c;
            i4Var3.Y.b(i4Var3.f231156f);
        }
        u3Var.f231365c.W(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.j3(this));
    }
}
