package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class v3 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f12250a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f12251b;

    public void a(androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem) {
        if (this.f12251b == null) {
            this.f12251b = new java.util.ArrayList();
        }
        int size = this.f12251b.size();
        for (int i17 = 0; i17 < size; i17++) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f12251b.get(i17);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f11942d == staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f11942d) {
                this.f12251b.remove(i17);
            }
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f11942d >= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f11942d) {
                this.f12251b.add(i17, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
        }
        this.f12251b.add(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
    }

    public void b(int i17) {
        int[] iArr = this.f12250a;
        if (iArr == null) {
            int[] iArr2 = new int[java.lang.Math.max(i17, 10) + 1];
            this.f12250a = iArr2;
            java.util.Arrays.fill(iArr2, -1);
        } else if (i17 >= iArr.length) {
            int length = iArr.length;
            while (length <= i17) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f12250a = iArr3;
            java.lang.System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f12250a;
            java.util.Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public int c(int i17) {
        java.util.List list = this.f12251b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f12251b.get(size)).f11942d >= i17) {
                    this.f12251b.remove(size);
                }
            }
        }
        return f(i17);
    }

    public androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem d(int i17, int i18, int i19, boolean z17) {
        java.util.List list = this.f12251b;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i27 = 0; i27 < size; i27++) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f12251b.get(i27);
            int i28 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f11942d;
            if (i28 >= i18) {
                return null;
            }
            if (i28 >= i17 && (i19 == 0 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f11943e == i19 || (z17 && staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f11945g))) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    public androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e(int i17) {
        java.util.List list = this.f12251b;
        if (list == null) {
            return null;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f12251b.get(size);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f11942d == i17) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f(int r5) {
        /*
            r4 = this;
            int[] r0 = r4.f12250a
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.length
            if (r5 < r0) goto La
            return r1
        La:
            java.util.List r0 = r4.f12251b
            if (r0 != 0) goto L10
        Le:
            r0 = r1
            goto L46
        L10:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.e(r5)
            if (r0 == 0) goto L1b
            java.util.List r2 = r4.f12251b
            r2.remove(r0)
        L1b:
            java.util.List r0 = r4.f12251b
            int r0 = r0.size()
            r2 = 0
        L22:
            if (r2 >= r0) goto L34
            java.util.List r3 = r4.f12251b
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r3
            int r3 = r3.f11942d
            if (r3 < r5) goto L31
            goto L35
        L31:
            int r2 = r2 + 1
            goto L22
        L34:
            r2 = r1
        L35:
            if (r2 == r1) goto Le
            java.util.List r0 = r4.f12251b
            java.lang.Object r0 = r0.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r0
            java.util.List r3 = r4.f12251b
            r3.remove(r2)
            int r0 = r0.f11942d
        L46:
            if (r0 != r1) goto L52
            int[] r0 = r4.f12250a
            int r2 = r0.length
            java.util.Arrays.fill(r0, r5, r2, r1)
            int[] r5 = r4.f12250a
            int r5 = r5.length
            return r5
        L52:
            int[] r2 = r4.f12250a
            int r0 = r0 + 1
            java.util.Arrays.fill(r2, r5, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.v3.f(int):int");
    }

    public void g(int i17, int i18) {
        int[] iArr = this.f12250a;
        if (iArr == null || i17 >= iArr.length) {
            return;
        }
        int i19 = i17 + i18;
        b(i19);
        int[] iArr2 = this.f12250a;
        java.lang.System.arraycopy(iArr2, i17, iArr2, i19, (iArr2.length - i17) - i18);
        java.util.Arrays.fill(this.f12250a, i17, i19, -1);
        java.util.List list = this.f12251b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f12251b.get(size);
            int i27 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f11942d;
            if (i27 >= i17) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f11942d = i27 + i18;
            }
        }
    }

    public void h(int i17, int i18) {
        int[] iArr = this.f12250a;
        if (iArr == null || i17 >= iArr.length) {
            return;
        }
        int i19 = i17 + i18;
        b(i19);
        int[] iArr2 = this.f12250a;
        java.lang.System.arraycopy(iArr2, i19, iArr2, i17, (iArr2.length - i17) - i18);
        int[] iArr3 = this.f12250a;
        java.util.Arrays.fill(iArr3, iArr3.length - i18, iArr3.length, -1);
        java.util.List list = this.f12251b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f12251b.get(size);
            int i27 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f11942d;
            if (i27 >= i17) {
                if (i27 < i19) {
                    this.f12251b.remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f11942d = i27 - i18;
                }
            }
        }
    }
}
