package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0010\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0006\u0010\u0010\u001a\u00020\u000fJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0001\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012J#\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/DataStore;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "", "", "isEmpty", "", "getSize", "getLast", "()Ljava/lang/Object;", ya.b.f77479x42930b2, "get", "(I)Ljava/lang/Object;", "safeGet", "Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;", "getDataListJustForAdapter", "", "getListInfo", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3048xa13f9cad, "Ljava/lang/Class;", "clazz", "", "getListOfType", "getLastItemOfType", "(Ljava/lang/Class;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "dataList", "Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;", "getDataList", "()Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;", "setDataList", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.model.internal.DataStore */
/* loaded from: classes2.dex */
public class C13921x61207337<T> {
    private java.lang.String TAG = "Finder." + getClass().getSimpleName() + "_@" + hashCode();
    private com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> dataList = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<>(new java.util.ArrayList());

    public final T get(int index) {
        return this.dataList.get(index);
    }

    /* renamed from: getDataList */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56387xe6796cde() {
        return this.dataList;
    }

    /* renamed from: getDataListJustForAdapter */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56388xcaeb60d0() {
        return this.dataList;
    }

    /* renamed from: getLast */
    public final T m56389xfb81fb0c() {
        return (T) kz5.n0.k0(this.dataList);
    }

    /* renamed from: getLastItemOfType */
    public final <E> E m56390x6aa252d0(java.lang.Class<E> clazz) {
        T t17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> c13920xa5f564aa = this.dataList;
        java.util.ListIterator<T> listIterator = c13920xa5f564aa.listIterator(c13920xa5f564aa.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                t17 = null;
                break;
            }
            t17 = listIterator.previous();
            if (clazz.isInstance(t17)) {
                break;
            }
        }
        if (t17 != null) {
            return (E) t17;
        }
        return null;
    }

    /* renamed from: getListInfo */
    public final java.lang.String m56391xcc0a47e2() {
        java.lang.String str = "DataStore: info count: " + this.dataList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getTAG(), str);
        int i17 = 0;
        for (T t17 : this.dataList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getTAG(), "DataStore:index " + i17 + " obj:" + t17);
            i17 = i18;
        }
        return str;
    }

    /* renamed from: getListOfType */
    public final <E> java.util.List<E> m56392xfc5c33e5(java.lang.Class<E> clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t17 : this.dataList) {
            if (clazz.isInstance(t17)) {
                arrayList.add(t17);
            }
        }
        return arrayList;
    }

    /* renamed from: getSize */
    public final int m56393xfb854877() {
        return this.dataList.size();
    }

    public java.lang.String getTAG() {
        return this.TAG;
    }

    /* renamed from: isEmpty */
    public final boolean m56394x7aab3243() {
        return this.dataList.isEmpty();
    }

    /* renamed from: safeGet */
    public final T m56395x6ebf1089(int index) {
        if (index < 0 || index >= this.dataList.size()) {
            return null;
        }
        return this.dataList.get(index);
    }

    /* renamed from: setDataList */
    public final void m56396xe131cdea(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> c13920xa5f564aa) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c13920xa5f564aa, "<set-?>");
        this.dataList = c13920xa5f564aa;
    }

    /* renamed from: setTAG */
    public void mo56017xca0293d8(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.TAG = str;
    }
}
