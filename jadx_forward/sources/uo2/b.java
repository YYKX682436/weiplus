package uo2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca f511134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca c14492xad25b4ca) {
        super(2);
        this.f511134d = c14492xad25b4ca;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("success:");
        sb6.append(booleanValue);
        sb6.append(" , filePath:");
        sb6.append(str);
        sb6.append(", fileExist:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14492xad25b4ca c14492xad25b4ca = this.f511134d;
        sb6.append(o35.a.b(c14492xad25b4ca.getFilePath()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFollowTopicHeaderView", sb6.toString());
        pm0.v.X(new uo2.a(c14492xad25b4ca, str, booleanValue));
        return jz5.f0.f384359a;
    }
}
