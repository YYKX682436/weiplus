package o;

/* loaded from: classes15.dex */
public class r implements g3.a {
    public static final int[] E = {1, 4, 5, 3, 2, 0};
    public o.u B;
    public boolean D;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f423313d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.res.Resources f423314e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f423315f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f423316g;

    /* renamed from: h, reason: collision with root package name */
    public o.p f423317h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f423318i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f423319m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f423320n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f423321o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f423322p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f423323q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f423325s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.drawable.Drawable f423326t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f423327u;

    /* renamed from: r, reason: collision with root package name */
    public int f423324r = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f423328v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f423329w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f423330x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f423331y = false;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f423332z = new java.util.ArrayList();
    public final java.util.concurrent.CopyOnWriteArrayList A = new java.util.concurrent.CopyOnWriteArrayList();
    public boolean C = false;

    public r(android.content.Context context) {
        boolean z17;
        boolean z18 = false;
        this.f423313d = context;
        android.content.res.Resources resources = context.getResources();
        this.f423314e = resources;
        this.f423318i = new java.util.ArrayList();
        this.f423319m = new java.util.ArrayList();
        this.f423320n = true;
        this.f423321o = new java.util.ArrayList();
        this.f423322p = new java.util.ArrayList();
        this.f423323q = true;
        if (resources.getConfiguration().keyboard != 1) {
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
            java.lang.reflect.Method method = n3.o1.f415911a;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                z17 = n3.n1.b(viewConfiguration);
            } else {
                android.content.res.Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
                z17 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z17) {
                z18 = true;
            }
        }
        this.f423316g = z18;
    }

    public android.view.MenuItem a(int i17, int i18, int i19, java.lang.CharSequence charSequence) {
        int i27;
        int i28 = ((-65536) & i19) >> 16;
        if (i28 < 0 || i28 >= 6) {
            throw new java.lang.IllegalArgumentException("order does not contain a valid category.");
        }
        int i29 = (E[i28] << 16) | (65535 & i19);
        o.u uVar = new o.u(this, i17, i18, i19, i29, charSequence, this.f423324r);
        java.util.ArrayList arrayList = this.f423318i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i27 = 0;
                break;
            }
            if (((o.u) arrayList.get(size)).f423340g <= i29) {
                i27 = size + 1;
                break;
            }
        }
        arrayList.add(i27, uVar);
        p(true);
        return uVar;
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i17, int i18, int i19, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i27, android.view.MenuItem[] menuItemArr) {
        int i28;
        android.content.pm.PackageManager packageManager = this.f423313d.getPackageManager();
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i27 & 1) == 0) {
            removeGroup(i17);
        }
        for (int i29 = 0; i29 < size; i29++) {
            android.content.pm.ResolveInfo resolveInfo = queryIntentActivityOptions.get(i29);
            int i37 = resolveInfo.specificIndex;
            android.content.Intent intent2 = new android.content.Intent(i37 < 0 ? intent : intentArr[i37]);
            android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new android.content.ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            android.view.MenuItem intent3 = a(i17, i18, i19, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i28 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i28] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(o.g0 g0Var, android.content.Context context) {
        this.A.add(new java.lang.ref.WeakReference(g0Var));
        g0Var.d(context, this);
        this.f423323q = true;
    }

    public final void c(boolean z17) {
        if (this.f423331y) {
            return;
        }
        this.f423331y = true;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.A;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            o.g0 g0Var = (o.g0) weakReference.get();
            if (g0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                g0Var.a(this, z17);
            }
        }
        this.f423331y = false;
    }

    @Override // android.view.Menu
    public void clear() {
        o.u uVar = this.B;
        if (uVar != null) {
            d(uVar);
        }
        this.f423318i.clear();
        p(true);
    }

    /* renamed from: clearHeader */
    public void m150334x8dded73a() {
        this.f423326t = null;
        this.f423325s = null;
        this.f423327u = null;
        p(false);
    }

    @Override // android.view.Menu
    public void close() {
        c(true);
    }

    public boolean d(o.u uVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.A;
        boolean z17 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.B == uVar) {
            z();
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                o.g0 g0Var = (o.g0) weakReference.get();
                if (g0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z17 = g0Var.h(this, uVar);
                    if (z17) {
                        break;
                    }
                }
            }
            y();
            if (z17) {
                this.B = null;
            }
        }
        return z17;
    }

    public boolean e(o.r rVar, android.view.MenuItem menuItem) {
        o.p pVar = this.f423317h;
        return pVar != null && pVar.b(rVar, menuItem);
    }

    public boolean f(o.u uVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.A;
        boolean z17 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        z();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            o.g0 g0Var = (o.g0) weakReference.get();
            if (g0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z17 = g0Var.j(this, uVar);
                if (z17) {
                    break;
                }
            }
        }
        y();
        if (z17) {
            this.B = uVar;
        }
        return z17;
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int i17) {
        android.view.MenuItem findItem;
        int size = size();
        for (int i18 = 0; i18 < size; i18++) {
            o.u uVar = (o.u) this.f423318i.get(i18);
            if (uVar.f423337d == i17) {
                return uVar;
            }
            if (uVar.hasSubMenu() && (findItem = uVar.f423351u.findItem(i17)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public o.u g(int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = this.f423332z;
        arrayList.clear();
        h(arrayList, i17, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o.u) arrayList.get(0);
        }
        boolean n17 = n();
        for (int i18 = 0; i18 < size; i18++) {
            o.u uVar = (o.u) arrayList.get(i18);
            char c17 = n17 ? uVar.f423346p : uVar.f423344n;
            char[] cArr = keyData.meta;
            if ((c17 == cArr[0] && (metaState & 2) == 0) || ((c17 == cArr[2] && (metaState & 2) != 0) || (n17 && c17 == '\b' && i17 == 67))) {
                return uVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int i17) {
        return (android.view.MenuItem) this.f423318i.get(i17);
    }

    public void h(java.util.List list, int i17, android.view.KeyEvent keyEvent) {
        int i18;
        boolean n17 = n();
        int modifiers = keyEvent.getModifiers();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i17 == 67) {
            java.util.ArrayList arrayList = this.f423318i;
            int size = arrayList.size();
            for (0; i18 < size; i18 + 1) {
                o.u uVar = (o.u) arrayList.get(i18);
                if (uVar.hasSubMenu()) {
                    uVar.f423351u.h(list, i17, keyEvent);
                }
                char c17 = n17 ? uVar.f423346p : uVar.f423344n;
                if (((modifiers & 69647) == ((n17 ? uVar.f423347q : uVar.f423345o) & 69647)) && c17 != 0) {
                    char[] cArr = keyData.meta;
                    if (c17 != cArr[0] && c17 != cArr[2]) {
                        if (n17 && c17 == '\b') {
                            i18 = i17 != 67 ? i18 + 1 : 0;
                        }
                    }
                    if (uVar.isEnabled()) {
                        list.add(uVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.D) {
            return true;
        }
        int size = size();
        for (int i17 = 0; i17 < size; i17++) {
            if (((o.u) this.f423318i.get(i17)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        java.util.ArrayList l17 = l();
        if (this.f423323q) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.A;
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                o.g0 g0Var = (o.g0) weakReference.get();
                if (g0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z17 |= g0Var.e();
                }
            }
            java.util.ArrayList arrayList = this.f423321o;
            java.util.ArrayList arrayList2 = this.f423322p;
            if (z17) {
                arrayList.clear();
                arrayList2.clear();
                int size = l17.size();
                for (int i17 = 0; i17 < size; i17++) {
                    o.u uVar = (o.u) l17.get(i17);
                    if ((uVar.D & 32) == 32) {
                        arrayList.add(uVar);
                    } else {
                        arrayList2.add(uVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f423323q = false;
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i17, android.view.KeyEvent keyEvent) {
        return g(i17, keyEvent) != null;
    }

    public java.lang.String j() {
        return "android:menu:actionviewstates";
    }

    public o.r k() {
        return this;
    }

    public java.util.ArrayList l() {
        boolean z17 = this.f423320n;
        java.util.ArrayList arrayList = this.f423319m;
        if (!z17) {
            return arrayList;
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f423318i;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            o.u uVar = (o.u) arrayList2.get(i17);
            if (uVar.isVisible()) {
                arrayList.add(uVar);
            }
        }
        this.f423320n = false;
        this.f423323q = true;
        return arrayList;
    }

    public boolean m() {
        return this.C;
    }

    public boolean n() {
        return this.f423315f;
    }

    public boolean o() {
        return this.f423316g;
    }

    public void p(boolean z17) {
        if (this.f423328v) {
            this.f423329w = true;
            if (z17) {
                this.f423330x = true;
                return;
            }
            return;
        }
        if (z17) {
            this.f423320n = true;
            this.f423323q = true;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.A;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        z();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            o.g0 g0Var = (o.g0) weakReference.get();
            if (g0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                g0Var.c(z17);
            }
        }
        y();
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i17, int i18) {
        return q(findItem(i17), null, i18);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i17, android.view.KeyEvent keyEvent, int i18) {
        o.u g17 = g(i17, keyEvent);
        boolean q17 = g17 != null ? q(g17, null, i18) : false;
        if ((i18 & 2) != 0) {
            c(true);
        }
        return q17;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q(android.view.MenuItem r17, o.g0 r18, int r19) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r.q(android.view.MenuItem, o.g0, int):boolean");
    }

    public void r(o.g0 g0Var) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.A;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            o.g0 g0Var2 = (o.g0) weakReference.get();
            if (g0Var2 == null || g0Var2 == g0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i17) {
        java.util.ArrayList arrayList;
        int size = size();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            arrayList = this.f423318i;
            if (i19 >= size) {
                i19 = -1;
                break;
            } else if (((o.u) arrayList.get(i19)).f423338e == i17) {
                break;
            } else {
                i19++;
            }
        }
        if (i19 >= 0) {
            int size2 = arrayList.size() - i19;
            while (true) {
                int i27 = i18 + 1;
                if (i18 >= size2 || ((o.u) arrayList.get(i19)).f423338e != i17) {
                    break;
                }
                if (i19 >= 0 && i19 < arrayList.size()) {
                    arrayList.remove(i19);
                }
                i18 = i27;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i17) {
        java.util.ArrayList arrayList;
        int size = size();
        int i18 = 0;
        while (true) {
            arrayList = this.f423318i;
            if (i18 >= size) {
                i18 = -1;
                break;
            } else if (((o.u) arrayList.get(i18)).f423337d == i17) {
                break;
            } else {
                i18++;
            }
        }
        if (i18 < 0 || i18 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i18);
        p(true);
    }

    public void s(android.os.Bundle bundle) {
        android.view.MenuItem findItem;
        if (bundle == null) {
            return;
        }
        android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.MenuItem item = getItem(i17);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((o.o0) item.getSubMenu()).s(bundle);
            }
        }
        int i18 = bundle.getInt("android:menu:expandedactionview");
        if (i18 <= 0 || (findItem = findItem(i18)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i17, boolean z17, boolean z18) {
        java.util.ArrayList arrayList = this.f423318i;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            o.u uVar = (o.u) arrayList.get(i18);
            if (uVar.f423338e == i17) {
                uVar.f(z18);
                uVar.setCheckable(z17);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z17) {
        this.C = z17;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i17, boolean z17) {
        java.util.ArrayList arrayList = this.f423318i;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            o.u uVar = (o.u) arrayList.get(i18);
            if (uVar.f423338e == i17) {
                uVar.setEnabled(z17);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i17, boolean z17) {
        java.util.ArrayList arrayList = this.f423318i;
        int size = arrayList.size();
        boolean z18 = false;
        for (int i18 = 0; i18 < size; i18++) {
            o.u uVar = (o.u) arrayList.get(i18);
            if (uVar.f423338e == i17) {
                int i19 = uVar.D;
                int i27 = (i19 & (-9)) | (z17 ? 0 : 8);
                uVar.D = i27;
                if (i19 != i27) {
                    z18 = true;
                }
            }
        }
        if (z18) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z17) {
        this.f423315f = z17;
        p(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f423318i.size();
    }

    public void t(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.A;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                o.g0 g0Var = (o.g0) weakReference.get();
                if (g0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int mo2872x5db1b11 = g0Var.mo2872x5db1b11();
                    if (mo2872x5db1b11 > 0 && (parcelable = (android.os.Parcelable) sparseParcelableArray.get(mo2872x5db1b11)) != null) {
                        g0Var.f(parcelable);
                    }
                }
            }
        }
    }

    public void u(android.os.Bundle bundle) {
        int size = size();
        android.util.SparseArray<? extends android.os.Parcelable> sparseArray = null;
        for (int i17 = 0; i17 < size; i17++) {
            android.view.MenuItem item = getItem(i17);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new android.util.SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((o.o0) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public void v(android.os.Bundle bundle) {
        android.os.Parcelable b17;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.A;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        android.util.SparseArray<? extends android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            o.g0 g0Var = (o.g0) weakReference.get();
            if (g0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int mo2872x5db1b11 = g0Var.mo2872x5db1b11();
                if (mo2872x5db1b11 > 0 && (b17 = g0Var.b()) != null) {
                    sparseArray.put(mo2872x5db1b11, b17);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public void w(o.p pVar) {
        this.f423317h = pVar;
    }

    public final void x(int i17, java.lang.CharSequence charSequence, int i18, android.graphics.drawable.Drawable drawable, android.view.View view) {
        if (view != null) {
            this.f423327u = view;
            this.f423325s = null;
            this.f423326t = null;
        } else {
            if (i17 > 0) {
                this.f423325s = this.f423314e.getText(i17);
            } else if (charSequence != null) {
                this.f423325s = charSequence;
            }
            if (i18 > 0) {
                this.f423326t = b3.l.m9707x4a96be14(this.f423313d, i18);
            } else if (drawable != null) {
                this.f423326t = drawable;
            }
            this.f423327u = null;
        }
        p(false);
    }

    public void y() {
        this.f423328v = false;
        if (this.f423329w) {
            this.f423329w = false;
            p(this.f423330x);
        }
    }

    public void z() {
        if (this.f423328v) {
            return;
        }
        this.f423328v = true;
        this.f423329w = false;
        this.f423330x = false;
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i17) {
        return a(0, 0, 0, this.f423314e.getString(i17));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i17) {
        return addSubMenu(0, 0, 0, this.f423314e.getString(i17));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i17, int i18, int i19, java.lang.CharSequence charSequence) {
        return a(i17, i18, i19, charSequence);
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i17, int i18, int i19, java.lang.CharSequence charSequence) {
        o.u uVar = (o.u) a(i17, i18, i19, charSequence);
        o.o0 o0Var = new o.o0(this.f423313d, this, uVar);
        uVar.f423351u = o0Var;
        o0Var.setHeaderTitle(uVar.f423341h);
        return o0Var;
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i17, int i18, int i19, int i27) {
        return a(i17, i18, i19, this.f423314e.getString(i27));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i17, int i18, int i19, int i27) {
        return addSubMenu(i17, i18, i19, this.f423314e.getString(i27));
    }
}
