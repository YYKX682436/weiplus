package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

/* loaded from: classes2.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f205969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.util.List list, java.lang.String str) {
        super(0);
        this.f205969d = list;
        this.f205970e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List list = this.f205969d;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.e0(262144, (r45.ro2) it.next()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.UserPoiHandler", "[saveData] infoList.size=" + list.size() + ", firstPage.size=" + linkedList.size());
        if (linkedList.size() > 0) {
            bu2.e0.f106031a.a(20, this.f205970e, linkedList);
        }
        return jz5.f0.f384359a;
    }
}
