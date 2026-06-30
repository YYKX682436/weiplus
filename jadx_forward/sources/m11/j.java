package m11;

/* loaded from: classes12.dex */
public class j implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p944x882e457a.v0, k70.x {

    /* renamed from: f, reason: collision with root package name */
    public m11.h f404249f = null;

    /* renamed from: g, reason: collision with root package name */
    public m11.t0 f404250g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f404251h = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f404247d = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f404248e = new java.util.HashSet();

    public j() {
        gm0.j1.n().f354821b.a(109, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.v0
    public void S(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m11.h hVar;
        java.util.Iterator it;
        m11.j jVar = this;
        if (jVar.f404250g != m1Var || (hVar = jVar.f404249f) == null || hVar.f404238f == null) {
            return;
        }
        java.util.Iterator it6 = new java.util.ArrayList(jVar.f404249f.f404238f).iterator();
        while (it6.hasNext()) {
            m11.i iVar = (m11.i) it6.next();
            k70.w wVar = iVar.f404241a;
            if (wVar != null) {
                m11.h hVar2 = jVar.f404249f;
                it = it6;
                wVar.o(hVar2.f404233a, hVar2.f404234b, hVar2.f404235c, hVar2.f404236d, hVar2.f404237e, iVar.f404242b, (int) j17, (int) j18, m1Var);
            } else {
                it = it6;
            }
            jVar = this;
            it6 = it;
        }
    }

    public final void a(m11.h hVar) {
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ModelImage.DownloadImgService", "task is null");
            return;
        }
        java.util.List<m11.i> list = hVar.f404238f;
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ModelImage.DownloadImgService", "task callback list is null");
            return;
        }
        for (m11.i iVar : list) {
            k70.w wVar = iVar.f404241a;
            if (wVar != null) {
                wVar.l(hVar.f404233a, hVar.f404234b, hVar.f404235c, hVar.f404236d, hVar.f404237e, iVar.f404242b);
            }
        }
    }

    public int b(long j17, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, int i17, java.lang.Object obj, int i18, k70.w wVar, int i19, boolean z17) {
        if (wVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ModelImage.DownloadImgService", "listener is null");
            return -1;
        }
        m11.h hVar = new m11.h(j17, c16564xb55e1d5.f231013d, c16564xb55e1d5.a(), i17);
        hVar.f404237e = i18;
        if (this.f404248e.contains(hVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ModelImage.DownloadImgService", "[" + wVar.hashCode() + "] add failed, task already done");
            return -2;
        }
        m11.h hVar2 = this.f404249f;
        if (hVar2 != null && hVar.m146622xb2c87fbf(hVar2)) {
            return this.f404249f.a(wVar, obj) ? 0 : -3;
        }
        java.util.List list = this.f404247d;
        int indexOf = list.indexOf(hVar);
        if (-1 < indexOf && indexOf < list.size()) {
            return ((m11.h) list.get(indexOf)).a(wVar, obj) ? 0 : -4;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ModelImage.DownloadImgService", "[" + wVar.hashCode() + "] no found task, create a new task(" + j17 + " " + c16564xb55e1d5.f231013d + " " + c16564xb55e1d5.a() + " " + i17 + ") mLockStart: %s callbackDuration %s", java.lang.Boolean.valueOf(this.f404251h), java.lang.Integer.valueOf(i19));
        hVar.a(wVar, obj);
        if (!z17 || list.size() <= 0) {
            list.add(hVar);
        } else {
            list.add(0, hVar);
        }
        i(i19);
        return 0;
    }

    public boolean c(long j17, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, int i17, java.lang.Object obj, int i18, k70.w wVar) {
        return b(j17, c16564xb55e1d5, i17, obj, i18, wVar, -1, false) >= 0;
    }

    public void d(k70.w wVar) {
        if (wVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ModelImage.DownloadImgService", "listener is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ModelImage.DownloadImgService", "[" + wVar.hashCode() + "] cancel all tasks of listener");
        this.f404251h = true;
        if (this.f404249f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ModelImage.DownloadImgService", "cancelAllTaskByListener CurTaskInfo %s mTodoList %s mLockStart %s", this.f404249f.f404233a + ", " + this.f404249f.f404234b + ", " + this.f404249f.f404236d, java.lang.Integer.valueOf(this.f404247d.size()), java.lang.Boolean.valueOf(this.f404251h));
            f(this.f404249f);
        }
        java.util.LinkedList<m11.h> linkedList = new java.util.LinkedList();
        synchronized (this.f404247d) {
            linkedList.addAll(this.f404247d);
        }
        for (m11.h hVar : linkedList) {
            if (hVar != null) {
                m11.i iVar = new m11.i(wVar, null);
                if (hVar.f404238f.contains(iVar)) {
                    hVar.f404238f.remove(iVar);
                }
                if (hVar.f404238f.size() <= 0) {
                    f(hVar);
                }
            }
        }
        this.f404251h = false;
        i(-1);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(wVar.hashCode());
        objArr[1] = this.f404249f == null ? "mCurTaskInfo is null" : this.f404249f.f404233a + ", " + this.f404249f.f404234b + ", " + this.f404249f.f404236d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ModelImage.DownloadImgService", "[ %s ] cancelAllTaskByListener done mCurTaskInfo %s", objArr);
    }

    public boolean e(long j17, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, int i17) {
        return f(new m11.h(j17, c16564xb55e1d5.f231013d, c16564xb55e1d5.a(), i17));
    }

    public final boolean f(m11.h hVar) {
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ModelImage.DownloadImgService", "task is null");
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel scene, (");
        sb6.append(hVar.f404233a);
        sb6.append(", ");
        long j17 = hVar.f404234b;
        sb6.append(j17);
        sb6.append(", ");
        int i17 = hVar.f404236d;
        sb6.append(i17);
        sb6.append(")");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ModelImage.DownloadImgService", sb6.toString());
        m11.h hVar2 = this.f404249f;
        if (hVar2 == null || !hVar2.m146622xb2c87fbf(hVar)) {
            java.util.List list = this.f404247d;
            if (!list.contains(hVar)) {
                return false;
            }
            if (list.remove(hVar)) {
                a(hVar);
            }
            return true;
        }
        gm0.j1.n().f354821b.d(this.f404250g);
        this.f404250g = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ModelImage.DownloadImgService", "cancelNetScene reset curTaskInfo (%s %s %s)", java.lang.Long.valueOf(hVar.f404233a), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        a(this.f404249f);
        this.f404249f = null;
        i(-1);
        return true;
    }

    public boolean g(long j17, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, int i17, k70.w wVar) {
        m11.h hVar;
        if (wVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ModelImage.DownloadImgService", "listener is null");
            return false;
        }
        m11.h hVar2 = new m11.h(j17, c16564xb55e1d5.f231013d, c16564xb55e1d5.a(), i17);
        m11.h hVar3 = this.f404249f;
        if (hVar3 == null || !hVar3.m146622xb2c87fbf(hVar2)) {
            java.util.List list = this.f404247d;
            int indexOf = list.indexOf(hVar2);
            hVar = -1 != indexOf ? (m11.h) list.get(indexOf) : null;
        } else {
            hVar = this.f404249f;
        }
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ModelImage.DownloadImgService", "[" + wVar.hashCode() + "] task no found, (" + j17 + ", " + c16564xb55e1d5 + ", " + i17 + ")");
            return false;
        }
        m11.i iVar = new m11.i(wVar, null);
        if (hVar.f404238f.contains(iVar)) {
            hVar.f404238f.remove(iVar);
        }
        if (hVar.f404238f.size() <= 0) {
            f(hVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ModelImage.DownloadImgService", "[" + wVar.hashCode() + "] task has been canceled, (" + j17 + ", " + c16564xb55e1d5 + ", " + i17 + ")");
        return true;
    }

    public boolean h(long j17, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, int i17) {
        m11.h hVar = new m11.h(j17, c16564xb55e1d5.f231013d, c16564xb55e1d5.a(), i17);
        m11.h hVar2 = this.f404249f;
        return (hVar2 != null && hVar2.m146622xb2c87fbf(hVar)) || this.f404247d.indexOf(hVar) >= 0;
    }

    public final void i(int i17) {
        java.lang.String str;
        synchronized (this.f404247d) {
            if (this.f404249f == null && this.f404247d.size() > 0 && true != this.f404251h) {
                m11.h hVar = (m11.h) this.f404247d.remove(0);
                this.f404249f = hVar;
                if (hVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ModelImage.DownloadImgService", "null == mCurTaskInfo");
                    return;
                }
                m11.h hVar2 = this.f404249f;
                this.f404250g = new m11.t0(hVar2.f404233a, hVar2.f404234b, hVar2.f404235c, hVar2.f404236d, this, i17);
                int i18 = this.f404249f.f404237e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ModelImage.DownloadImgService", "do scene, (" + this.f404249f.f404233a + ", " + this.f404249f.f404234b + ", " + this.f404249f.f404236d + ")");
                gm0.j1.n().f354821b.g(this.f404250g);
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (this.f404249f == null) {
                str = "mCurTaskInfo is null";
            } else {
                str = this.f404249f.f404233a + ", " + this.f404249f.f404234b + ", " + this.f404249f.f404236d;
            }
            objArr[0] = str;
            objArr[1] = java.lang.Integer.valueOf(this.f404247d.size());
            objArr[2] = java.lang.Boolean.valueOf(this.f404251h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ModelImage.DownloadImgService", "mCurTaskInfo %s mTodoList %s mLockStart %s", objArr);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m11.h hVar;
        java.util.Iterator it;
        java.util.HashSet hashSet;
        if (this.f404250g != m1Var || (hVar = this.f404249f) == null || hVar.f404238f == null) {
            return;
        }
        java.util.HashSet hashSet2 = this.f404248e;
        hashSet2.add(new m11.h(hVar.f404233a, hVar.f404234b, hVar.f404235c, hVar.f404236d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ModelImage.DownloadImgService", "scene end, (" + this.f404249f.f404233a + ", " + this.f404249f.f404234b + ", " + this.f404249f.f404236d + ")");
        java.util.Iterator it6 = new java.util.ArrayList(this.f404249f.f404238f).iterator();
        while (it6.hasNext()) {
            m11.i iVar = (m11.i) it6.next();
            k70.w wVar = iVar.f404241a;
            if (wVar != null) {
                m11.h hVar2 = this.f404249f;
                it = it6;
                hashSet = hashSet2;
                wVar.f(hVar2.f404233a, hVar2.f404234b, hVar2.f404235c, hVar2.f404236d, hVar2.f404237e, iVar.f404242b, i17, i18, str, m1Var);
            } else {
                it = it6;
                hashSet = hashSet2;
            }
            hashSet2 = hashSet;
            it6 = it;
        }
        hashSet2.remove(this.f404249f);
        this.f404249f = null;
        this.f404250g = null;
        i(-1);
    }
}
