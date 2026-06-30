package xh3;

/* loaded from: classes12.dex */
public final class h implements xh3.c {

    /* renamed from: a, reason: collision with root package name */
    public xh3.d f536112a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f536113b = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f536114c = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f536115d = new java.util.concurrent.CopyOnWriteArrayList();

    public static final boolean a(xh3.h hVar, java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.Object obj;
        hVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMMarsTaskDistributor", str2 + " by jni " + str3 + " return for invalid mediaId:" + str);
            return false;
        }
        if (!list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = hVar.f536115d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh3.f) obj).f536109a, str)) {
                break;
            }
        }
        xh3.f fVar = (xh3.f) obj;
        if (fVar == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMMarsTaskDistributor", str2 + " by jni " + str3 + " return for not containsKey task:" + fVar.f536110b + " msg:" + str4);
        return false;
    }

    public boolean b(xh3.b task) {
        java.lang.String str;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (!(task instanceof yh3.d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMMarsTaskDistributor", "cancelTask failed for unknown task:" + task);
            return true;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f536114c;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = task.f536105h;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((yh3.d) obj).f536105h, str)) {
                break;
            }
        }
        if (((yh3.d) obj) != null) {
            copyOnWriteArrayList.remove(task);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMMarsTaskDistributor", "cancelTask success for download task:" + task);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMMarsTaskDistributor", "cancelTask failed for null download taskId:" + str + " task:" + task);
        return false;
    }

    public java.util.List c(java.lang.String str) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMMarsTaskDistributor", "getDownloadTaskListByMediaId failed for mediaId:NULL");
            return copyOnWriteArrayList;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.f536114c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : copyOnWriteArrayList2) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((yh3.d) obj).f536104g, str)) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            copyOnWriteArrayList.add((yh3.d) it.next());
        }
        return copyOnWriteArrayList;
    }

    public java.util.List d(java.lang.String str) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMMarsTaskDistributor", "getPreloadTaskListByMediaId failed for mediaId:NULL");
            return copyOnWriteArrayList;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.f536113b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArrayList2.iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
            copyOnWriteArrayList.add(null);
        }
        return copyOnWriteArrayList;
    }

    public boolean e(xh3.b task) {
        java.lang.String str;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (task instanceof yh3.d) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f536114c;
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str = task.f536105h;
                if (!hasNext) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((yh3.d) obj).f536105h, str)) {
                    break;
                }
            }
            if (((yh3.d) obj) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMMarsTaskDistributor", "submitTask failed for duplicated download task:" + task);
                return false;
            }
            java.util.List d17 = d(task.f536104g);
            java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArrayList) d17).iterator();
            while (it6.hasNext()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(this.f536113b).remove((xh3.b) it6.next());
            }
            if (!r6.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMMarsTaskDistributor", "submitTask remove same preload task:" + task + " list:" + d17);
            }
            copyOnWriteArrayList.add(task);
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.f536115d;
            if (copyOnWriteArrayList2.size() > 200) {
                copyOnWriteArrayList2.remove(0);
            }
            copyOnWriteArrayList2.add(new xh3.f(str, task.m175559x9616526c()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMMarsTaskDistributor", "submitTask success for download task:" + task + " size:" + copyOnWriteArrayList.size() + " downloading:[" + copyOnWriteArrayList + ']');
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMMarsTaskDistributor", "submitTask failed for unknown task:" + task);
        }
        return true;
    }
}
