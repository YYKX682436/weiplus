package com.google.android.flexbox;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.flexbox.a f44252a;

    /* renamed from: b, reason: collision with root package name */
    public boolean[] f44253b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f44254c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f44255d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f44256e;

    public f(com.google.android.flexbox.a aVar) {
        this.f44252a = aVar;
    }

    public final void a(java.util.List list, com.google.android.flexbox.b bVar, int i17, int i18) {
        bVar.f44242m = i18;
        this.f44252a.i(bVar);
        bVar.f44245p = i17;
        list.add(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x020c, code lost:
    
        if (r8 < (r13 + r15)) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.google.android.flexbox.d r29, int r30, int r31, int r32, int r33, int r34, java.util.List r35) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.f.b(com.google.android.flexbox.d, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.getMinWidth()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.getMinWidth()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.getMaxWidth()
            if (r1 <= r3) goto L26
            int r1 = r0.getMaxWidth()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.getMinHeight()
            if (r2 >= r5) goto L32
            int r2 = r0.getMinHeight()
            goto L3e
        L32:
            int r5 = r0.getMaxHeight()
            if (r2 <= r5) goto L3d
            int r2 = r0.getMaxHeight()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.v(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f44252a
            r0.j(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.f.c(android.view.View, int):void");
    }

    public void d(java.util.List list, int i17) {
        int i18 = this.f44254c[i17];
        if (i18 == -1) {
            i18 = 0;
        }
        if (list.size() > i18) {
            list.subList(i18, list.size()).clear();
        }
        int[] iArr = this.f44254c;
        int length = iArr.length - 1;
        if (i17 > length) {
            java.util.Arrays.fill(iArr, -1);
        } else {
            java.util.Arrays.fill(iArr, i17, length, -1);
        }
        long[] jArr = this.f44255d;
        int length2 = jArr.length - 1;
        if (i17 > length2) {
            java.util.Arrays.fill(jArr, 0L);
        } else {
            java.util.Arrays.fill(jArr, i17, length2, 0L);
        }
    }

    public final java.util.List e(java.util.List list, int i17, int i18) {
        int i19 = (i17 - i18) / 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.flexbox.b bVar = new com.google.android.flexbox.b();
        bVar.f44236g = i19;
        int size = list.size();
        for (int i27 = 0; i27 < size; i27++) {
            if (i27 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add((com.google.android.flexbox.b) list.get(i27));
            if (i27 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final java.util.List f(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        for (int i18 = 0; i18 < i17; i18++) {
            com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) this.f44252a.c(i18).getLayoutParams();
            com.google.android.flexbox.e eVar = new com.google.android.flexbox.e(null);
            eVar.f44251e = flexItem.getOrder();
            eVar.f44250d = i18;
            arrayList.add(eVar);
        }
        return arrayList;
    }

    public void g(int i17, int i18, int i19) {
        int mode;
        int size;
        com.google.android.flexbox.a aVar = this.f44252a;
        int flexDirection = aVar.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            mode = android.view.View.MeasureSpec.getMode(i18);
            size = android.view.View.MeasureSpec.getSize(i18);
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new java.lang.IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            mode = android.view.View.MeasureSpec.getMode(i17);
            size = android.view.View.MeasureSpec.getSize(i17);
        }
        java.util.List<com.google.android.flexbox.b> flexLinesInternal = aVar.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = aVar.getSumOfCrossSize() + i19;
            int i27 = 0;
            if (flexLinesInternal.size() == 1) {
                ((com.google.android.flexbox.b) flexLinesInternal.get(0)).f44236g = size - i19;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = aVar.getAlignContent();
                if (alignContent == 1) {
                    com.google.android.flexbox.b bVar = new com.google.android.flexbox.b();
                    bVar.f44236g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, bVar);
                    return;
                }
                if (alignContent == 2) {
                    aVar.setFlexLines(e(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size2 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f17 = 0.0f;
                    while (i27 < size3) {
                        arrayList.add((com.google.android.flexbox.b) flexLinesInternal.get(i27));
                        if (i27 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.b bVar2 = new com.google.android.flexbox.b();
                            if (i27 == flexLinesInternal.size() - 2) {
                                bVar2.f44236g = java.lang.Math.round(f17 + size2);
                                f17 = 0.0f;
                            } else {
                                bVar2.f44236g = java.lang.Math.round(size2);
                            }
                            int i28 = bVar2.f44236g;
                            f17 += size2 - i28;
                            if (f17 > 1.0f) {
                                bVar2.f44236g = i28 + 1;
                                f17 -= 1.0f;
                            } else if (f17 < -1.0f) {
                                bVar2.f44236g = i28 - 1;
                                f17 += 1.0f;
                            }
                            arrayList.add(bVar2);
                        }
                        i27++;
                    }
                    aVar.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        aVar.setFlexLines(e(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    com.google.android.flexbox.b bVar3 = new com.google.android.flexbox.b();
                    bVar3.f44236g = size4;
                    for (com.google.android.flexbox.b bVar4 : flexLinesInternal) {
                        arrayList2.add(bVar3);
                        arrayList2.add(bVar4);
                        arrayList2.add(bVar3);
                    }
                    aVar.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f18 = 0.0f;
                    while (i27 < size6) {
                        com.google.android.flexbox.b bVar5 = (com.google.android.flexbox.b) flexLinesInternal.get(i27);
                        float f19 = bVar5.f44236g + size5;
                        if (i27 == flexLinesInternal.size() - 1) {
                            f19 += f18;
                            f18 = 0.0f;
                        }
                        int round = java.lang.Math.round(f19);
                        f18 += f19 - round;
                        if (f18 > 1.0f) {
                            round++;
                            f18 -= 1.0f;
                        } else if (f18 < -1.0f) {
                            round--;
                            f18 += 1.0f;
                        }
                        bVar5.f44236g = round;
                        i27++;
                    }
                }
            }
        }
    }

    public void h(int i17, int i18, int i19) {
        int size;
        int paddingLeft;
        int paddingRight;
        com.google.android.flexbox.a aVar = this.f44252a;
        int flexItemCount = aVar.getFlexItemCount();
        boolean[] zArr = this.f44253b;
        if (zArr == null) {
            this.f44253b = new boolean[java.lang.Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f44253b = new boolean[java.lang.Math.max(zArr.length * 2, flexItemCount)];
        } else {
            java.util.Arrays.fill(zArr, false);
        }
        if (i19 >= aVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = aVar.getFlexDirection();
        int flexDirection2 = aVar.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = android.view.View.MeasureSpec.getMode(i17);
            size = android.view.View.MeasureSpec.getSize(i17);
            int largestMainSize = aVar.getLargestMainSize();
            if (mode != 1073741824) {
                size = java.lang.Math.min(largestMainSize, size);
            }
            paddingLeft = aVar.getPaddingLeft();
            paddingRight = aVar.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new java.lang.IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = android.view.View.MeasureSpec.getMode(i18);
            size = android.view.View.MeasureSpec.getSize(i18);
            if (mode2 != 1073741824) {
                size = aVar.getLargestMainSize();
            }
            paddingLeft = aVar.getPaddingTop();
            paddingRight = aVar.getPaddingBottom();
        }
        int i27 = paddingLeft + paddingRight;
        int[] iArr = this.f44254c;
        java.util.List flexLinesInternal = aVar.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i28 = iArr != null ? iArr[i19] : 0; i28 < size2; i28++) {
            com.google.android.flexbox.b bVar = (com.google.android.flexbox.b) flexLinesInternal.get(i28);
            int i29 = bVar.f44234e;
            if (i29 < size && bVar.f44246q) {
                l(i17, i18, bVar, size, i27, false);
            } else if (i29 > size && bVar.f44247r) {
                q(i17, i18, bVar, size, i27, false);
            }
        }
    }

    public void i(int i17) {
        int[] iArr = this.f44254c;
        if (iArr == null) {
            this.f44254c = new int[java.lang.Math.max(i17, 10)];
        } else if (iArr.length < i17) {
            this.f44254c = java.util.Arrays.copyOf(this.f44254c, java.lang.Math.max(iArr.length * 2, i17));
        }
    }

    public void j(int i17) {
        long[] jArr = this.f44255d;
        if (jArr == null) {
            this.f44255d = new long[java.lang.Math.max(i17, 10)];
        } else if (jArr.length < i17) {
            this.f44255d = java.util.Arrays.copyOf(this.f44255d, java.lang.Math.max(jArr.length * 2, i17));
        }
    }

    public void k(int i17) {
        long[] jArr = this.f44256e;
        if (jArr == null) {
            this.f44256e = new long[java.lang.Math.max(i17, 10)];
        } else if (jArr.length < i17) {
            this.f44256e = java.util.Arrays.copyOf(this.f44256e, java.lang.Math.max(jArr.length * 2, i17));
        }
    }

    public final void l(int i17, int i18, com.google.android.flexbox.b bVar, int i19, int i27, boolean z17) {
        int i28;
        int i29;
        com.google.android.flexbox.a aVar;
        com.google.android.flexbox.a aVar2;
        int max;
        double d17;
        com.google.android.flexbox.a aVar3;
        android.view.View view;
        double d18;
        float f17 = bVar.f44239j;
        if (f17 <= 0.0f || i19 < (i28 = bVar.f44234e)) {
            return;
        }
        float f18 = (i19 - i28) / f17;
        bVar.f44234e = i27 + bVar.f44235f;
        if (!z17) {
            bVar.f44236g = Integer.MIN_VALUE;
        }
        int i37 = 0;
        boolean z18 = false;
        int i38 = 0;
        float f19 = 0.0f;
        while (i37 < bVar.f44237h) {
            int i39 = bVar.f44244o + i37;
            com.google.android.flexbox.a aVar4 = this.f44252a;
            android.view.View f27 = aVar4.f(i39);
            if (f27 == null || f27.getVisibility() == 8) {
                i29 = i28;
            } else {
                com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) f27.getLayoutParams();
                int flexDirection = aVar4.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = f27.getMeasuredWidth();
                    long[] jArr = this.f44256e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i39];
                    }
                    int measuredHeight = f27.getMeasuredHeight();
                    long[] jArr2 = this.f44256e;
                    if (jArr2 != null) {
                        long j17 = jArr2[i39];
                        aVar = aVar4;
                        i29 = i28;
                        measuredHeight = (int) (j17 >> 32);
                    } else {
                        aVar = aVar4;
                        i29 = i28;
                    }
                    if (this.f44253b[i39] || flexItem.getFlexGrow() <= 0.0f) {
                        aVar2 = aVar;
                    } else {
                        float flexGrow = measuredWidth + (flexItem.getFlexGrow() * f18);
                        if (i37 == bVar.f44237h - 1) {
                            flexGrow += f19;
                            f19 = 0.0f;
                        }
                        int round = java.lang.Math.round(flexGrow);
                        if (round > flexItem.getMaxWidth()) {
                            round = flexItem.getMaxWidth();
                            this.f44253b[i39] = true;
                            bVar.f44239j -= flexItem.getFlexGrow();
                            z18 = true;
                        } else {
                            f19 += flexGrow - round;
                            double d19 = f19;
                            if (d19 > 1.0d) {
                                round++;
                                d17 = d19 - 1.0d;
                            } else if (d19 < -1.0d) {
                                round--;
                                d17 = d19 + 1.0d;
                            }
                            f19 = (float) d17;
                        }
                        int m17 = m(i18, flexItem, bVar.f44242m);
                        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        f27.measure(makeMeasureSpec, m17);
                        int measuredWidth2 = f27.getMeasuredWidth();
                        int measuredHeight2 = f27.getMeasuredHeight();
                        v(i39, makeMeasureSpec, m17, f27);
                        aVar2 = aVar;
                        aVar2.j(i39, f27);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    max = java.lang.Math.max(i38, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + aVar2.e(f27));
                    bVar.f44234e += measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight();
                } else {
                    int measuredHeight3 = f27.getMeasuredHeight();
                    long[] jArr3 = this.f44256e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i39] >> 32);
                    }
                    int measuredWidth3 = f27.getMeasuredWidth();
                    long[] jArr4 = this.f44256e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i39];
                    }
                    if (this.f44253b[i39] || flexItem.getFlexGrow() <= 0.0f) {
                        aVar3 = aVar4;
                        view = f27;
                    } else {
                        float flexGrow2 = measuredHeight3 + (flexItem.getFlexGrow() * f18);
                        if (i37 == bVar.f44237h - 1) {
                            flexGrow2 += f19;
                            f19 = 0.0f;
                        }
                        int round2 = java.lang.Math.round(flexGrow2);
                        if (round2 > flexItem.getMaxHeight()) {
                            round2 = flexItem.getMaxHeight();
                            this.f44253b[i39] = true;
                            bVar.f44239j -= flexItem.getFlexGrow();
                            z18 = true;
                        } else {
                            f19 += flexGrow2 - round2;
                            double d27 = f19;
                            if (d27 > 1.0d) {
                                round2++;
                                d18 = d27 - 1.0d;
                            } else if (d27 < -1.0d) {
                                round2--;
                                d18 = d27 + 1.0d;
                            }
                            f19 = (float) d18;
                        }
                        int n17 = n(i17, flexItem, bVar.f44242m);
                        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        f27.measure(n17, makeMeasureSpec2);
                        measuredWidth3 = f27.getMeasuredWidth();
                        int measuredHeight4 = f27.getMeasuredHeight();
                        v(i39, n17, makeMeasureSpec2, f27);
                        aVar3 = aVar4;
                        aVar3.j(i39, f27);
                        view = f27;
                        measuredHeight3 = measuredHeight4;
                    }
                    max = java.lang.Math.max(i38, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + aVar3.e(view));
                    bVar.f44234e += measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom();
                    i29 = i28;
                }
                bVar.f44236g = java.lang.Math.max(bVar.f44236g, max);
                i38 = max;
            }
            i37++;
            i28 = i29;
        }
        int i47 = i28;
        if (!z18 || i47 == bVar.f44234e) {
            return;
        }
        l(i17, i18, bVar, i19, i27, true);
    }

    public final int m(int i17, com.google.android.flexbox.FlexItem flexItem, int i18) {
        com.google.android.flexbox.a aVar = this.f44252a;
        int d17 = aVar.d(i17, aVar.getPaddingTop() + aVar.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i18, flexItem.getHeight());
        int size = android.view.View.MeasureSpec.getSize(d17);
        return size > flexItem.getMaxHeight() ? android.view.View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), android.view.View.MeasureSpec.getMode(d17)) : size < flexItem.getMinHeight() ? android.view.View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), android.view.View.MeasureSpec.getMode(d17)) : d17;
    }

    public final int n(int i17, com.google.android.flexbox.FlexItem flexItem, int i18) {
        com.google.android.flexbox.a aVar = this.f44252a;
        int h17 = aVar.h(i17, aVar.getPaddingLeft() + aVar.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i18, flexItem.getWidth());
        int size = android.view.View.MeasureSpec.getSize(h17);
        return size > flexItem.getMaxWidth() ? android.view.View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), android.view.View.MeasureSpec.getMode(h17)) : size < flexItem.getMinWidth() ? android.view.View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), android.view.View.MeasureSpec.getMode(h17)) : h17;
    }

    public void o(android.view.View view, com.google.android.flexbox.b bVar, int i17, int i18, int i19, int i27) {
        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) view.getLayoutParams();
        com.google.android.flexbox.a aVar = this.f44252a;
        int alignItems = aVar.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i28 = bVar.f44236g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (aVar.getFlexWrap() == 2) {
                    view.layout(i17, (i18 - i28) + view.getMeasuredHeight() + flexItem.getMarginTop(), i19, (i27 - i28) + view.getMeasuredHeight() + flexItem.getMarginTop());
                    return;
                } else {
                    int i29 = i18 + i28;
                    view.layout(i17, (i29 - view.getMeasuredHeight()) - flexItem.getMarginBottom(), i19, i29 - flexItem.getMarginBottom());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i28 - view.getMeasuredHeight()) + flexItem.getMarginTop()) - flexItem.getMarginBottom()) / 2;
                if (aVar.getFlexWrap() != 2) {
                    int i37 = i18 + measuredHeight;
                    view.layout(i17, i37, i19, view.getMeasuredHeight() + i37);
                    return;
                } else {
                    int i38 = i18 - measuredHeight;
                    view.layout(i17, i38, i19, view.getMeasuredHeight() + i38);
                    return;
                }
            }
            if (alignItems == 3) {
                if (aVar.getFlexWrap() != 2) {
                    int max = java.lang.Math.max(bVar.f44241l - view.getBaseline(), flexItem.getMarginTop());
                    view.layout(i17, i18 + max, i19, i27 + max);
                    return;
                } else {
                    int max2 = java.lang.Math.max((bVar.f44241l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.getMarginBottom());
                    view.layout(i17, i18 - max2, i19, i27 - max2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (aVar.getFlexWrap() != 2) {
            view.layout(i17, i18 + flexItem.getMarginTop(), i19, i27 + flexItem.getMarginTop());
        } else {
            view.layout(i17, i18 - flexItem.getMarginBottom(), i19, i27 - flexItem.getMarginBottom());
        }
    }

    public void p(android.view.View view, com.google.android.flexbox.b bVar, boolean z17, int i17, int i18, int i19, int i27) {
        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) view.getLayoutParams();
        int alignItems = this.f44252a.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i28 = bVar.f44236g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z17) {
                    view.layout((i17 - i28) + view.getMeasuredWidth() + flexItem.getMarginLeft(), i18, (i19 - i28) + view.getMeasuredWidth() + flexItem.getMarginLeft(), i27);
                    return;
                } else {
                    view.layout(((i17 + i28) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i18, ((i19 + i28) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i27);
                    return;
                }
            }
            if (alignItems == 2) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i28 - view.getMeasuredWidth()) + n3.u.c(marginLayoutParams)) - n3.u.b(marginLayoutParams)) / 2;
                if (z17) {
                    view.layout(i17 - measuredWidth, i18, i19 - measuredWidth, i27);
                    return;
                } else {
                    view.layout(i17 + measuredWidth, i18, i19 + measuredWidth, i27);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z17) {
            view.layout(i17 - flexItem.getMarginRight(), i18, i19 - flexItem.getMarginRight(), i27);
        } else {
            view.layout(i17 + flexItem.getMarginLeft(), i18, i19 + flexItem.getMarginLeft(), i27);
        }
    }

    public final void q(int i17, int i18, com.google.android.flexbox.b bVar, int i19, int i27, boolean z17) {
        android.view.View view;
        int max;
        com.google.android.flexbox.a aVar;
        android.view.View view2;
        int i28 = bVar.f44234e;
        float f17 = bVar.f44240k;
        if (f17 <= 0.0f || i19 > i28) {
            return;
        }
        float f18 = (i28 - i19) / f17;
        bVar.f44234e = i27 + bVar.f44235f;
        if (!z17) {
            bVar.f44236g = Integer.MIN_VALUE;
        }
        boolean z18 = false;
        int i29 = 0;
        float f19 = 0.0f;
        for (int i37 = 0; i37 < bVar.f44237h; i37++) {
            int i38 = bVar.f44244o + i37;
            com.google.android.flexbox.a aVar2 = this.f44252a;
            android.view.View f27 = aVar2.f(i38);
            if (f27 != null && f27.getVisibility() != 8) {
                com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) f27.getLayoutParams();
                int flexDirection = aVar2.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = f27.getMeasuredWidth();
                    long[] jArr = this.f44256e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i38];
                    }
                    int measuredHeight = f27.getMeasuredHeight();
                    long[] jArr2 = this.f44256e;
                    if (jArr2 != null) {
                        long j17 = jArr2[i38];
                        view = f27;
                        measuredHeight = (int) (j17 >> 32);
                    } else {
                        view = f27;
                    }
                    if (!this.f44253b[i38] && flexItem.getFlexShrink() > 0.0f) {
                        float flexShrink = measuredWidth - (flexItem.getFlexShrink() * f18);
                        if (i37 == bVar.f44237h - 1) {
                            flexShrink += f19;
                            f19 = 0.0f;
                        }
                        int round = java.lang.Math.round(flexShrink);
                        if (round < flexItem.getMinWidth()) {
                            round = flexItem.getMinWidth();
                            this.f44253b[i38] = true;
                            bVar.f44240k -= flexItem.getFlexShrink();
                            z18 = true;
                        } else {
                            f19 += flexShrink - round;
                            double d17 = f19;
                            if (d17 > 1.0d) {
                                round++;
                                f19 -= 1.0f;
                            } else if (d17 < -1.0d) {
                                round--;
                                f19 += 1.0f;
                            }
                        }
                        int m17 = m(i18, flexItem, bVar.f44242m);
                        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        view.measure(makeMeasureSpec, m17);
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        v(i38, makeMeasureSpec, m17, view);
                        aVar2.j(i38, view);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    max = java.lang.Math.max(i29, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + aVar2.e(view));
                    bVar.f44234e += measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight();
                } else {
                    int measuredHeight3 = f27.getMeasuredHeight();
                    long[] jArr3 = this.f44256e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i38] >> 32);
                    }
                    int measuredWidth3 = f27.getMeasuredWidth();
                    long[] jArr4 = this.f44256e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i38];
                    }
                    if (this.f44253b[i38] || flexItem.getFlexShrink() <= 0.0f) {
                        aVar = aVar2;
                        view2 = f27;
                    } else {
                        float flexShrink2 = measuredHeight3 - (flexItem.getFlexShrink() * f18);
                        if (i37 == bVar.f44237h - 1) {
                            flexShrink2 += f19;
                            f19 = 0.0f;
                        }
                        int round2 = java.lang.Math.round(flexShrink2);
                        if (round2 < flexItem.getMinHeight()) {
                            round2 = flexItem.getMinHeight();
                            this.f44253b[i38] = true;
                            bVar.f44240k -= flexItem.getFlexShrink();
                            z18 = true;
                        } else {
                            f19 += flexShrink2 - round2;
                            double d18 = f19;
                            if (d18 > 1.0d) {
                                round2++;
                                f19 -= 1.0f;
                            } else if (d18 < -1.0d) {
                                round2--;
                                f19 += 1.0f;
                            }
                        }
                        int n17 = n(i17, flexItem, bVar.f44242m);
                        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        f27.measure(n17, makeMeasureSpec2);
                        measuredWidth3 = f27.getMeasuredWidth();
                        int measuredHeight4 = f27.getMeasuredHeight();
                        v(i38, n17, makeMeasureSpec2, f27);
                        aVar = aVar2;
                        aVar.j(i38, f27);
                        view2 = f27;
                        measuredHeight3 = measuredHeight4;
                    }
                    max = java.lang.Math.max(i29, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + aVar.e(view2));
                    bVar.f44234e += measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom();
                }
                bVar.f44236g = java.lang.Math.max(bVar.f44236g, max);
                i29 = max;
            }
        }
        if (!z18 || i28 == bVar.f44234e) {
            return;
        }
        q(i17, i18, bVar, i19, i27, true);
    }

    public final int[] r(int i17, java.util.List list, android.util.SparseIntArray sparseIntArray) {
        java.util.Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i17];
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            com.google.android.flexbox.e eVar = (com.google.android.flexbox.e) it.next();
            int i19 = eVar.f44250d;
            iArr[i18] = i19;
            sparseIntArray.append(i19, eVar.f44251e);
            i18++;
        }
        return iArr;
    }

    public final void s(android.view.View view, int i17, int i18) {
        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) view.getLayoutParams();
        int marginLeft = (i17 - flexItem.getMarginLeft()) - flexItem.getMarginRight();
        com.google.android.flexbox.a aVar = this.f44252a;
        int min = java.lang.Math.min(java.lang.Math.max(marginLeft - aVar.e(view), flexItem.getMinWidth()), flexItem.getMaxWidth());
        long[] jArr = this.f44256e;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i18] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        v(i18, makeMeasureSpec2, makeMeasureSpec, view);
        aVar.j(i18, view);
    }

    public final void t(android.view.View view, int i17, int i18) {
        com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) view.getLayoutParams();
        int marginTop = (i17 - flexItem.getMarginTop()) - flexItem.getMarginBottom();
        com.google.android.flexbox.a aVar = this.f44252a;
        int min = java.lang.Math.min(java.lang.Math.max(marginTop - aVar.e(view), flexItem.getMinHeight()), flexItem.getMaxHeight());
        long[] jArr = this.f44256e;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i18] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        v(i18, makeMeasureSpec, makeMeasureSpec2, view);
        aVar.j(i18, view);
    }

    public void u(int i17) {
        android.view.View f17;
        com.google.android.flexbox.a aVar = this.f44252a;
        if (i17 >= aVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = aVar.getFlexDirection();
        if (aVar.getAlignItems() != 4) {
            for (com.google.android.flexbox.b bVar : aVar.getFlexLinesInternal()) {
                java.util.Iterator it = ((java.util.ArrayList) bVar.f44243n).iterator();
                while (it.hasNext()) {
                    java.lang.Integer num = (java.lang.Integer) it.next();
                    android.view.View f18 = aVar.f(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        t(f18, bVar.f44236g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new java.lang.IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        s(f18, bVar.f44236g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f44254c;
        java.util.List flexLinesInternal = aVar.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i18 = iArr != null ? iArr[i17] : 0; i18 < size; i18++) {
            com.google.android.flexbox.b bVar2 = (com.google.android.flexbox.b) flexLinesInternal.get(i18);
            int i19 = bVar2.f44237h;
            for (int i27 = 0; i27 < i19; i27++) {
                int i28 = bVar2.f44244o + i27;
                if (i27 < aVar.getFlexItemCount() && (f17 = aVar.f(i28)) != null && f17.getVisibility() != 8) {
                    com.google.android.flexbox.FlexItem flexItem = (com.google.android.flexbox.FlexItem) f17.getLayoutParams();
                    if (flexItem.getAlignSelf() == -1 || flexItem.getAlignSelf() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(f17, bVar2.f44236g, i28);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new java.lang.IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            s(f17, bVar2.f44236g, i28);
                        }
                    }
                }
            }
        }
    }

    public final void v(int i17, int i18, int i19, android.view.View view) {
        long[] jArr = this.f44255d;
        if (jArr != null) {
            jArr[i17] = (i18 & io.flutter.embedding.android.KeyboardMap.kValueMask) | (i19 << 32);
        }
        long[] jArr2 = this.f44256e;
        if (jArr2 != null) {
            jArr2[i17] = (view.getMeasuredWidth() & io.flutter.embedding.android.KeyboardMap.kValueMask) | (view.getMeasuredHeight() << 32);
        }
    }
}
