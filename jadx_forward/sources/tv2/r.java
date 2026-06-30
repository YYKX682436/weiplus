package tv2;

/* loaded from: classes10.dex */
public final class r {
    public r(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final dn.m a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem, dn.k taskCallback, java.lang.String name, java.lang.String mediaId, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskCallback, "taskCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        dn.m mVar = new dn.m();
        mVar.f323318d = name;
        mVar.f323320f = taskCallback;
        mVar.f69601xaca5bdda = mediaId;
        mVar.f69595x6d25b0d9 = str;
        mVar.f69619xe9ed65f6 = str2;
        mVar.f69618x114ef53e = "";
        boolean z17 = true;
        mVar.f69606xccdbf540 = true;
        mVar.f69609xd84b8349 = 2;
        mVar.f69584x89a4c0cf = 2;
        mVar.f69580x454032b6 = 251;
        mVar.f69592xf1ebe47b = i17;
        mVar.A = i18;
        mVar.B = i19;
        mVar.N = uv2.i.f512922a.g(finderItem.getFeedObject());
        if (str3 != null && str3.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            mVar.N += str3;
        }
        if (lVar != null) {
            lVar.mo146xb9724478(mVar);
        }
        return mVar;
    }
}
