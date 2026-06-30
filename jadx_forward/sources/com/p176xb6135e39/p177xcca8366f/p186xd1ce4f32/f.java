package com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a f125785a;

    /* renamed from: b, reason: collision with root package name */
    public boolean[] f125786b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f125787c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f125788d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f125789e;

    public f(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar) {
        this.f125785a = aVar;
    }

    public final void a(java.util.List list, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar, int i17, int i18) {
        bVar.f125775m = i18;
        this.f125785a.i(bVar);
        bVar.f125778p = i17;
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
    public void b(com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.d r29, int r30, int r31, int r32, int r33, int r34, java.util.List r35) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.f.b(com.google.android.flexbox.d, int, int, int, int, int, java.util.List):void");
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
            com.google.android.flexbox.FlexItem r0 = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo17213x29d8f80a()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.mo17213x29d8f80a()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.mo17211x93b79438()
            if (r1 <= r3) goto L26
            int r1 = r0.mo17211x93b79438()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.mo17212xf7770f63()
            if (r2 >= r5) goto L32
            int r2 = r0.mo17212xf7770f63()
            goto L3e
        L32:
            int r5 = r0.mo17210xc96bf8f5()
            if (r2 <= r5) goto L3d
            int r2 = r0.mo17210xc96bf8f5()
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
            com.google.android.flexbox.a r0 = r6.f125785a
            r0.j(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.f.c(android.view.View, int):void");
    }

    public void d(java.util.List list, int i17) {
        int i18 = this.f125787c[i17];
        if (i18 == -1) {
            i18 = 0;
        }
        if (list.size() > i18) {
            list.subList(i18, list.size()).clear();
        }
        int[] iArr = this.f125787c;
        int length = iArr.length - 1;
        if (i17 > length) {
            java.util.Arrays.fill(iArr, -1);
        } else {
            java.util.Arrays.fill(iArr, i17, length, -1);
        }
        long[] jArr = this.f125788d;
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
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b();
        bVar.f125769g = i19;
        int size = list.size();
        for (int i27 = 0; i27 < size; i27++) {
            if (i27 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add((com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) list.get(i27));
            if (i27 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final java.util.List f(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        for (int i18 = 0; i18 < i17; i18++) {
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc interfaceC1624x6bcaaecc = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc) this.f125785a.c(i18).getLayoutParams();
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.e eVar = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.e(null);
            eVar.f125784e = interfaceC1624x6bcaaecc.mo17214x74ef2d98();
            eVar.f125783d = i18;
            arrayList.add(eVar);
        }
        return arrayList;
    }

    public void g(int i17, int i18, int i19) {
        int mode;
        int size;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar = this.f125785a;
        int mo17221x833fcbd0 = aVar.mo17221x833fcbd0();
        if (mo17221x833fcbd0 == 0 || mo17221x833fcbd0 == 1) {
            mode = android.view.View.MeasureSpec.getMode(i18);
            size = android.view.View.MeasureSpec.getSize(i18);
        } else {
            if (mo17221x833fcbd0 != 2 && mo17221x833fcbd0 != 3) {
                throw new java.lang.IllegalArgumentException("Invalid flex direction: " + mo17221x833fcbd0);
            }
            mode = android.view.View.MeasureSpec.getMode(i17);
            size = android.view.View.MeasureSpec.getSize(i17);
        }
        java.util.List<com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b> mo17224x68d3ead = aVar.mo17224x68d3ead();
        if (mode == 1073741824) {
            int mo17231xc050e9f5 = aVar.mo17231xc050e9f5() + i19;
            int i27 = 0;
            if (mo17224x68d3ead.size() == 1) {
                ((com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) mo17224x68d3ead.get(0)).f125769g = size - i19;
                return;
            }
            if (mo17224x68d3ead.size() >= 2) {
                int mo17217x3416c82a = aVar.mo17217x3416c82a();
                if (mo17217x3416c82a == 1) {
                    com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b();
                    bVar.f125769g = size - mo17231xc050e9f5;
                    mo17224x68d3ead.add(0, bVar);
                    return;
                }
                if (mo17217x3416c82a == 2) {
                    aVar.mo17238xf1ffa444(e(mo17224x68d3ead, size, mo17231xc050e9f5));
                    return;
                }
                if (mo17217x3416c82a == 3) {
                    if (mo17231xc050e9f5 >= size) {
                        return;
                    }
                    float size2 = (size - mo17231xc050e9f5) / (mo17224x68d3ead.size() - 1);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int size3 = mo17224x68d3ead.size();
                    float f17 = 0.0f;
                    while (i27 < size3) {
                        arrayList.add((com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) mo17224x68d3ead.get(i27));
                        if (i27 != mo17224x68d3ead.size() - 1) {
                            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar2 = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b();
                            if (i27 == mo17224x68d3ead.size() - 2) {
                                bVar2.f125769g = java.lang.Math.round(f17 + size2);
                                f17 = 0.0f;
                            } else {
                                bVar2.f125769g = java.lang.Math.round(size2);
                            }
                            int i28 = bVar2.f125769g;
                            f17 += size2 - i28;
                            if (f17 > 1.0f) {
                                bVar2.f125769g = i28 + 1;
                                f17 -= 1.0f;
                            } else if (f17 < -1.0f) {
                                bVar2.f125769g = i28 - 1;
                                f17 += 1.0f;
                            }
                            arrayList.add(bVar2);
                        }
                        i27++;
                    }
                    aVar.mo17238xf1ffa444(arrayList);
                    return;
                }
                if (mo17217x3416c82a == 4) {
                    if (mo17231xc050e9f5 >= size) {
                        aVar.mo17238xf1ffa444(e(mo17224x68d3ead, size, mo17231xc050e9f5));
                        return;
                    }
                    int size4 = (size - mo17231xc050e9f5) / (mo17224x68d3ead.size() * 2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar3 = new com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b();
                    bVar3.f125769g = size4;
                    for (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar4 : mo17224x68d3ead) {
                        arrayList2.add(bVar3);
                        arrayList2.add(bVar4);
                        arrayList2.add(bVar3);
                    }
                    aVar.mo17238xf1ffa444(arrayList2);
                    return;
                }
                if (mo17217x3416c82a == 5 && mo17231xc050e9f5 < size) {
                    float size5 = (size - mo17231xc050e9f5) / mo17224x68d3ead.size();
                    int size6 = mo17224x68d3ead.size();
                    float f18 = 0.0f;
                    while (i27 < size6) {
                        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar5 = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) mo17224x68d3ead.get(i27);
                        float f19 = bVar5.f125769g + size5;
                        if (i27 == mo17224x68d3ead.size() - 1) {
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
                        bVar5.f125769g = round;
                        i27++;
                    }
                }
            }
        }
    }

    public void h(int i17, int i18, int i19) {
        int size;
        int m17254x805c2682;
        int m17255x8b7f0b01;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar = this.f125785a;
        int mo17222x3b739e0d = aVar.mo17222x3b739e0d();
        boolean[] zArr = this.f125786b;
        if (zArr == null) {
            this.f125786b = new boolean[java.lang.Math.max(mo17222x3b739e0d, 10)];
        } else if (zArr.length < mo17222x3b739e0d) {
            this.f125786b = new boolean[java.lang.Math.max(zArr.length * 2, mo17222x3b739e0d)];
        } else {
            java.util.Arrays.fill(zArr, false);
        }
        if (i19 >= aVar.mo17222x3b739e0d()) {
            return;
        }
        int mo17221x833fcbd0 = aVar.mo17221x833fcbd0();
        int mo17221x833fcbd02 = aVar.mo17221x833fcbd0();
        if (mo17221x833fcbd02 == 0 || mo17221x833fcbd02 == 1) {
            int mode = android.view.View.MeasureSpec.getMode(i17);
            size = android.view.View.MeasureSpec.getSize(i17);
            int mo17227x5e625620 = aVar.mo17227x5e625620();
            if (mode != 1073741824) {
                size = java.lang.Math.min(mo17227x5e625620, size);
            }
            m17254x805c2682 = aVar.m17254x805c2682();
            m17255x8b7f0b01 = aVar.m17255x8b7f0b01();
        } else {
            if (mo17221x833fcbd02 != 2 && mo17221x833fcbd02 != 3) {
                throw new java.lang.IllegalArgumentException("Invalid flex direction: " + mo17221x833fcbd0);
            }
            int mode2 = android.view.View.MeasureSpec.getMode(i18);
            size = android.view.View.MeasureSpec.getSize(i18);
            if (mode2 != 1073741824) {
                size = aVar.mo17227x5e625620();
            }
            m17254x805c2682 = aVar.m17257xf39fff7a();
            m17255x8b7f0b01 = aVar.m17252xc96f6de6();
        }
        int i27 = m17254x805c2682 + m17255x8b7f0b01;
        int[] iArr = this.f125787c;
        java.util.List mo17224x68d3ead = aVar.mo17224x68d3ead();
        int size2 = mo17224x68d3ead.size();
        for (int i28 = iArr != null ? iArr[i19] : 0; i28 < size2; i28++) {
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) mo17224x68d3ead.get(i28);
            int i29 = bVar.f125767e;
            if (i29 < size && bVar.f125779q) {
                l(i17, i18, bVar, size, i27, false);
            } else if (i29 > size && bVar.f125780r) {
                q(i17, i18, bVar, size, i27, false);
            }
        }
    }

    public void i(int i17) {
        int[] iArr = this.f125787c;
        if (iArr == null) {
            this.f125787c = new int[java.lang.Math.max(i17, 10)];
        } else if (iArr.length < i17) {
            this.f125787c = java.util.Arrays.copyOf(this.f125787c, java.lang.Math.max(iArr.length * 2, i17));
        }
    }

    public void j(int i17) {
        long[] jArr = this.f125788d;
        if (jArr == null) {
            this.f125788d = new long[java.lang.Math.max(i17, 10)];
        } else if (jArr.length < i17) {
            this.f125788d = java.util.Arrays.copyOf(this.f125788d, java.lang.Math.max(jArr.length * 2, i17));
        }
    }

    public void k(int i17) {
        long[] jArr = this.f125789e;
        if (jArr == null) {
            this.f125789e = new long[java.lang.Math.max(i17, 10)];
        } else if (jArr.length < i17) {
            this.f125789e = java.util.Arrays.copyOf(this.f125789e, java.lang.Math.max(jArr.length * 2, i17));
        }
    }

    public final void l(int i17, int i18, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar, int i19, int i27, boolean z17) {
        int i28;
        int i29;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar2;
        int max;
        double d17;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar3;
        android.view.View view;
        double d18;
        float f17 = bVar.f125772j;
        if (f17 <= 0.0f || i19 < (i28 = bVar.f125767e)) {
            return;
        }
        float f18 = (i19 - i28) / f17;
        bVar.f125767e = i27 + bVar.f125768f;
        if (!z17) {
            bVar.f125769g = Integer.MIN_VALUE;
        }
        int i37 = 0;
        boolean z18 = false;
        int i38 = 0;
        float f19 = 0.0f;
        while (i37 < bVar.f125770h) {
            int i39 = bVar.f125777o + i37;
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar4 = this.f125785a;
            android.view.View f27 = aVar4.f(i39);
            if (f27 == null || f27.getVisibility() == 8) {
                i29 = i28;
            } else {
                com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc interfaceC1624x6bcaaecc = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc) f27.getLayoutParams();
                int mo17221x833fcbd0 = aVar4.mo17221x833fcbd0();
                if (mo17221x833fcbd0 == 0 || mo17221x833fcbd0 == 1) {
                    int measuredWidth = f27.getMeasuredWidth();
                    long[] jArr = this.f125789e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i39];
                    }
                    int measuredHeight = f27.getMeasuredHeight();
                    long[] jArr2 = this.f125789e;
                    if (jArr2 != null) {
                        long j17 = jArr2[i39];
                        aVar = aVar4;
                        i29 = i28;
                        measuredHeight = (int) (j17 >> 32);
                    } else {
                        aVar = aVar4;
                        i29 = i28;
                    }
                    if (this.f125786b[i39] || interfaceC1624x6bcaaecc.mo17203xe3c99922() <= 0.0f) {
                        aVar2 = aVar;
                    } else {
                        float mo17203xe3c99922 = measuredWidth + (interfaceC1624x6bcaaecc.mo17203xe3c99922() * f18);
                        if (i37 == bVar.f125770h - 1) {
                            mo17203xe3c99922 += f19;
                            f19 = 0.0f;
                        }
                        int round = java.lang.Math.round(mo17203xe3c99922);
                        if (round > interfaceC1624x6bcaaecc.mo17211x93b79438()) {
                            round = interfaceC1624x6bcaaecc.mo17211x93b79438();
                            this.f125786b[i39] = true;
                            bVar.f125772j -= interfaceC1624x6bcaaecc.mo17203xe3c99922();
                            z18 = true;
                        } else {
                            f19 += mo17203xe3c99922 - round;
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
                        int m17 = m(i18, interfaceC1624x6bcaaecc, bVar.f125775m);
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
                    max = java.lang.Math.max(i38, measuredHeight + interfaceC1624x6bcaaecc.mo17209xc1272e11() + interfaceC1624x6bcaaecc.mo17206x4fb623ef() + aVar2.e(f27));
                    bVar.f125767e += measuredWidth + interfaceC1624x6bcaaecc.mo17207x63bacacb() + interfaceC1624x6bcaaecc.mo17208x13f4efd8();
                } else {
                    int measuredHeight3 = f27.getMeasuredHeight();
                    long[] jArr3 = this.f125789e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i39] >> 32);
                    }
                    int measuredWidth3 = f27.getMeasuredWidth();
                    long[] jArr4 = this.f125789e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i39];
                    }
                    if (this.f125786b[i39] || interfaceC1624x6bcaaecc.mo17203xe3c99922() <= 0.0f) {
                        aVar3 = aVar4;
                        view = f27;
                    } else {
                        float mo17203xe3c999222 = measuredHeight3 + (interfaceC1624x6bcaaecc.mo17203xe3c99922() * f18);
                        if (i37 == bVar.f125770h - 1) {
                            mo17203xe3c999222 += f19;
                            f19 = 0.0f;
                        }
                        int round2 = java.lang.Math.round(mo17203xe3c999222);
                        if (round2 > interfaceC1624x6bcaaecc.mo17210xc96bf8f5()) {
                            round2 = interfaceC1624x6bcaaecc.mo17210xc96bf8f5();
                            this.f125786b[i39] = true;
                            bVar.f125772j -= interfaceC1624x6bcaaecc.mo17203xe3c99922();
                            z18 = true;
                        } else {
                            f19 += mo17203xe3c999222 - round2;
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
                        int n17 = n(i17, interfaceC1624x6bcaaecc, bVar.f125775m);
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
                    max = java.lang.Math.max(i38, measuredWidth3 + interfaceC1624x6bcaaecc.mo17207x63bacacb() + interfaceC1624x6bcaaecc.mo17208x13f4efd8() + aVar3.e(view));
                    bVar.f125767e += measuredHeight3 + interfaceC1624x6bcaaecc.mo17209xc1272e11() + interfaceC1624x6bcaaecc.mo17206x4fb623ef();
                    i29 = i28;
                }
                bVar.f125769g = java.lang.Math.max(bVar.f125769g, max);
                i38 = max;
            }
            i37++;
            i28 = i29;
        }
        int i47 = i28;
        if (!z18 || i47 == bVar.f125767e) {
            return;
        }
        l(i17, i18, bVar, i19, i27, true);
    }

    public final int m(int i17, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc interfaceC1624x6bcaaecc, int i18) {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar = this.f125785a;
        int d17 = aVar.d(i17, aVar.m17257xf39fff7a() + aVar.m17252xc96f6de6() + interfaceC1624x6bcaaecc.mo17209xc1272e11() + interfaceC1624x6bcaaecc.mo17206x4fb623ef() + i18, interfaceC1624x6bcaaecc.mo17205x1c4fb41d());
        int size = android.view.View.MeasureSpec.getSize(d17);
        return size > interfaceC1624x6bcaaecc.mo17210xc96bf8f5() ? android.view.View.MeasureSpec.makeMeasureSpec(interfaceC1624x6bcaaecc.mo17210xc96bf8f5(), android.view.View.MeasureSpec.getMode(d17)) : size < interfaceC1624x6bcaaecc.mo17212xf7770f63() ? android.view.View.MeasureSpec.makeMeasureSpec(interfaceC1624x6bcaaecc.mo17212xf7770f63(), android.view.View.MeasureSpec.getMode(d17)) : d17;
    }

    public final int n(int i17, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc interfaceC1624x6bcaaecc, int i18) {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar = this.f125785a;
        int h17 = aVar.h(i17, aVar.m17254x805c2682() + aVar.m17255x8b7f0b01() + interfaceC1624x6bcaaecc.mo17207x63bacacb() + interfaceC1624x6bcaaecc.mo17208x13f4efd8() + i18, interfaceC1624x6bcaaecc.mo17215x755bd410());
        int size = android.view.View.MeasureSpec.getSize(h17);
        return size > interfaceC1624x6bcaaecc.mo17211x93b79438() ? android.view.View.MeasureSpec.makeMeasureSpec(interfaceC1624x6bcaaecc.mo17211x93b79438(), android.view.View.MeasureSpec.getMode(h17)) : size < interfaceC1624x6bcaaecc.mo17213x29d8f80a() ? android.view.View.MeasureSpec.makeMeasureSpec(interfaceC1624x6bcaaecc.mo17213x29d8f80a(), android.view.View.MeasureSpec.getMode(h17)) : h17;
    }

    public void o(android.view.View view, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar, int i17, int i18, int i19, int i27) {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc interfaceC1624x6bcaaecc = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc) view.getLayoutParams();
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar = this.f125785a;
        int mo17218xaee0b3b1 = aVar.mo17218xaee0b3b1();
        if (interfaceC1624x6bcaaecc.mo17202x68c1413b() != -1) {
            mo17218xaee0b3b1 = interfaceC1624x6bcaaecc.mo17202x68c1413b();
        }
        int i28 = bVar.f125769g;
        if (mo17218xaee0b3b1 != 0) {
            if (mo17218xaee0b3b1 == 1) {
                if (aVar.mo17225xe3d0dd59() == 2) {
                    view.layout(i17, (i18 - i28) + view.getMeasuredHeight() + interfaceC1624x6bcaaecc.mo17209xc1272e11(), i19, (i27 - i28) + view.getMeasuredHeight() + interfaceC1624x6bcaaecc.mo17209xc1272e11());
                    return;
                } else {
                    int i29 = i18 + i28;
                    view.layout(i17, (i29 - view.getMeasuredHeight()) - interfaceC1624x6bcaaecc.mo17206x4fb623ef(), i19, i29 - interfaceC1624x6bcaaecc.mo17206x4fb623ef());
                    return;
                }
            }
            if (mo17218xaee0b3b1 == 2) {
                int measuredHeight = (((i28 - view.getMeasuredHeight()) + interfaceC1624x6bcaaecc.mo17209xc1272e11()) - interfaceC1624x6bcaaecc.mo17206x4fb623ef()) / 2;
                if (aVar.mo17225xe3d0dd59() != 2) {
                    int i37 = i18 + measuredHeight;
                    view.layout(i17, i37, i19, view.getMeasuredHeight() + i37);
                    return;
                } else {
                    int i38 = i18 - measuredHeight;
                    view.layout(i17, i38, i19, view.getMeasuredHeight() + i38);
                    return;
                }
            }
            if (mo17218xaee0b3b1 == 3) {
                if (aVar.mo17225xe3d0dd59() != 2) {
                    int max = java.lang.Math.max(bVar.f125774l - view.getBaseline(), interfaceC1624x6bcaaecc.mo17209xc1272e11());
                    view.layout(i17, i18 + max, i19, i27 + max);
                    return;
                } else {
                    int max2 = java.lang.Math.max((bVar.f125774l - view.getMeasuredHeight()) + view.getBaseline(), interfaceC1624x6bcaaecc.mo17206x4fb623ef());
                    view.layout(i17, i18 - max2, i19, i27 - max2);
                    return;
                }
            }
            if (mo17218xaee0b3b1 != 4) {
                return;
            }
        }
        if (aVar.mo17225xe3d0dd59() != 2) {
            view.layout(i17, i18 + interfaceC1624x6bcaaecc.mo17209xc1272e11(), i19, i27 + interfaceC1624x6bcaaecc.mo17209xc1272e11());
        } else {
            view.layout(i17, i18 - interfaceC1624x6bcaaecc.mo17206x4fb623ef(), i19, i27 - interfaceC1624x6bcaaecc.mo17206x4fb623ef());
        }
    }

    public void p(android.view.View view, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar, boolean z17, int i17, int i18, int i19, int i27) {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc interfaceC1624x6bcaaecc = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc) view.getLayoutParams();
        int mo17218xaee0b3b1 = this.f125785a.mo17218xaee0b3b1();
        if (interfaceC1624x6bcaaecc.mo17202x68c1413b() != -1) {
            mo17218xaee0b3b1 = interfaceC1624x6bcaaecc.mo17202x68c1413b();
        }
        int i28 = bVar.f125769g;
        if (mo17218xaee0b3b1 != 0) {
            if (mo17218xaee0b3b1 == 1) {
                if (z17) {
                    view.layout((i17 - i28) + view.getMeasuredWidth() + interfaceC1624x6bcaaecc.mo17207x63bacacb(), i18, (i19 - i28) + view.getMeasuredWidth() + interfaceC1624x6bcaaecc.mo17207x63bacacb(), i27);
                    return;
                } else {
                    view.layout(((i17 + i28) - view.getMeasuredWidth()) - interfaceC1624x6bcaaecc.mo17208x13f4efd8(), i18, ((i19 + i28) - view.getMeasuredWidth()) - interfaceC1624x6bcaaecc.mo17208x13f4efd8(), i27);
                    return;
                }
            }
            if (mo17218xaee0b3b1 == 2) {
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
            if (mo17218xaee0b3b1 != 3 && mo17218xaee0b3b1 != 4) {
                return;
            }
        }
        if (z17) {
            view.layout(i17 - interfaceC1624x6bcaaecc.mo17208x13f4efd8(), i18, i19 - interfaceC1624x6bcaaecc.mo17208x13f4efd8(), i27);
        } else {
            view.layout(i17 + interfaceC1624x6bcaaecc.mo17207x63bacacb(), i18, i19 + interfaceC1624x6bcaaecc.mo17207x63bacacb(), i27);
        }
    }

    public final void q(int i17, int i18, com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar, int i19, int i27, boolean z17) {
        android.view.View view;
        int max;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar;
        android.view.View view2;
        int i28 = bVar.f125767e;
        float f17 = bVar.f125773k;
        if (f17 <= 0.0f || i19 > i28) {
            return;
        }
        float f18 = (i28 - i19) / f17;
        bVar.f125767e = i27 + bVar.f125768f;
        if (!z17) {
            bVar.f125769g = Integer.MIN_VALUE;
        }
        boolean z18 = false;
        int i29 = 0;
        float f19 = 0.0f;
        for (int i37 = 0; i37 < bVar.f125770h; i37++) {
            int i38 = bVar.f125777o + i37;
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar2 = this.f125785a;
            android.view.View f27 = aVar2.f(i38);
            if (f27 != null && f27.getVisibility() != 8) {
                com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc interfaceC1624x6bcaaecc = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc) f27.getLayoutParams();
                int mo17221x833fcbd0 = aVar2.mo17221x833fcbd0();
                if (mo17221x833fcbd0 == 0 || mo17221x833fcbd0 == 1) {
                    int measuredWidth = f27.getMeasuredWidth();
                    long[] jArr = this.f125789e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i38];
                    }
                    int measuredHeight = f27.getMeasuredHeight();
                    long[] jArr2 = this.f125789e;
                    if (jArr2 != null) {
                        long j17 = jArr2[i38];
                        view = f27;
                        measuredHeight = (int) (j17 >> 32);
                    } else {
                        view = f27;
                    }
                    if (!this.f125786b[i38] && interfaceC1624x6bcaaecc.mo17204x2bb64b58() > 0.0f) {
                        float mo17204x2bb64b58 = measuredWidth - (interfaceC1624x6bcaaecc.mo17204x2bb64b58() * f18);
                        if (i37 == bVar.f125770h - 1) {
                            mo17204x2bb64b58 += f19;
                            f19 = 0.0f;
                        }
                        int round = java.lang.Math.round(mo17204x2bb64b58);
                        if (round < interfaceC1624x6bcaaecc.mo17213x29d8f80a()) {
                            round = interfaceC1624x6bcaaecc.mo17213x29d8f80a();
                            this.f125786b[i38] = true;
                            bVar.f125773k -= interfaceC1624x6bcaaecc.mo17204x2bb64b58();
                            z18 = true;
                        } else {
                            f19 += mo17204x2bb64b58 - round;
                            double d17 = f19;
                            if (d17 > 1.0d) {
                                round++;
                                f19 -= 1.0f;
                            } else if (d17 < -1.0d) {
                                round--;
                                f19 += 1.0f;
                            }
                        }
                        int m17 = m(i18, interfaceC1624x6bcaaecc, bVar.f125775m);
                        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        view.measure(makeMeasureSpec, m17);
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        v(i38, makeMeasureSpec, m17, view);
                        aVar2.j(i38, view);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    max = java.lang.Math.max(i29, measuredHeight + interfaceC1624x6bcaaecc.mo17209xc1272e11() + interfaceC1624x6bcaaecc.mo17206x4fb623ef() + aVar2.e(view));
                    bVar.f125767e += measuredWidth + interfaceC1624x6bcaaecc.mo17207x63bacacb() + interfaceC1624x6bcaaecc.mo17208x13f4efd8();
                } else {
                    int measuredHeight3 = f27.getMeasuredHeight();
                    long[] jArr3 = this.f125789e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i38] >> 32);
                    }
                    int measuredWidth3 = f27.getMeasuredWidth();
                    long[] jArr4 = this.f125789e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i38];
                    }
                    if (this.f125786b[i38] || interfaceC1624x6bcaaecc.mo17204x2bb64b58() <= 0.0f) {
                        aVar = aVar2;
                        view2 = f27;
                    } else {
                        float mo17204x2bb64b582 = measuredHeight3 - (interfaceC1624x6bcaaecc.mo17204x2bb64b58() * f18);
                        if (i37 == bVar.f125770h - 1) {
                            mo17204x2bb64b582 += f19;
                            f19 = 0.0f;
                        }
                        int round2 = java.lang.Math.round(mo17204x2bb64b582);
                        if (round2 < interfaceC1624x6bcaaecc.mo17212xf7770f63()) {
                            round2 = interfaceC1624x6bcaaecc.mo17212xf7770f63();
                            this.f125786b[i38] = true;
                            bVar.f125773k -= interfaceC1624x6bcaaecc.mo17204x2bb64b58();
                            z18 = true;
                        } else {
                            f19 += mo17204x2bb64b582 - round2;
                            double d18 = f19;
                            if (d18 > 1.0d) {
                                round2++;
                                f19 -= 1.0f;
                            } else if (d18 < -1.0d) {
                                round2--;
                                f19 += 1.0f;
                            }
                        }
                        int n17 = n(i17, interfaceC1624x6bcaaecc, bVar.f125775m);
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
                    max = java.lang.Math.max(i29, measuredWidth3 + interfaceC1624x6bcaaecc.mo17207x63bacacb() + interfaceC1624x6bcaaecc.mo17208x13f4efd8() + aVar.e(view2));
                    bVar.f125767e += measuredHeight3 + interfaceC1624x6bcaaecc.mo17209xc1272e11() + interfaceC1624x6bcaaecc.mo17206x4fb623ef();
                }
                bVar.f125769g = java.lang.Math.max(bVar.f125769g, max);
                i29 = max;
            }
        }
        if (!z18 || i28 == bVar.f125767e) {
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
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.e eVar = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.e) it.next();
            int i19 = eVar.f125783d;
            iArr[i18] = i19;
            sparseIntArray.append(i19, eVar.f125784e);
            i18++;
        }
        return iArr;
    }

    public final void s(android.view.View view, int i17, int i18) {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc interfaceC1624x6bcaaecc = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc) view.getLayoutParams();
        int mo17207x63bacacb = (i17 - interfaceC1624x6bcaaecc.mo17207x63bacacb()) - interfaceC1624x6bcaaecc.mo17208x13f4efd8();
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar = this.f125785a;
        int min = java.lang.Math.min(java.lang.Math.max(mo17207x63bacacb - aVar.e(view), interfaceC1624x6bcaaecc.mo17213x29d8f80a()), interfaceC1624x6bcaaecc.mo17211x93b79438());
        long[] jArr = this.f125789e;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i18] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        v(i18, makeMeasureSpec2, makeMeasureSpec, view);
        aVar.j(i18, view);
    }

    public final void t(android.view.View view, int i17, int i18) {
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc interfaceC1624x6bcaaecc = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc) view.getLayoutParams();
        int mo17209xc1272e11 = (i17 - interfaceC1624x6bcaaecc.mo17209xc1272e11()) - interfaceC1624x6bcaaecc.mo17206x4fb623ef();
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar = this.f125785a;
        int min = java.lang.Math.min(java.lang.Math.max(mo17209xc1272e11 - aVar.e(view), interfaceC1624x6bcaaecc.mo17212xf7770f63()), interfaceC1624x6bcaaecc.mo17210xc96bf8f5());
        long[] jArr = this.f125789e;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i18] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        v(i18, makeMeasureSpec, makeMeasureSpec2, view);
        aVar.j(i18, view);
    }

    public void u(int i17) {
        android.view.View f17;
        com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.a aVar = this.f125785a;
        if (i17 >= aVar.mo17222x3b739e0d()) {
            return;
        }
        int mo17221x833fcbd0 = aVar.mo17221x833fcbd0();
        if (aVar.mo17218xaee0b3b1() != 4) {
            for (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar : aVar.mo17224x68d3ead()) {
                java.util.Iterator it = ((java.util.ArrayList) bVar.f125776n).iterator();
                while (it.hasNext()) {
                    java.lang.Integer num = (java.lang.Integer) it.next();
                    android.view.View f18 = aVar.f(num.intValue());
                    if (mo17221x833fcbd0 == 0 || mo17221x833fcbd0 == 1) {
                        t(f18, bVar.f125769g, num.intValue());
                    } else {
                        if (mo17221x833fcbd0 != 2 && mo17221x833fcbd0 != 3) {
                            throw new java.lang.IllegalArgumentException("Invalid flex direction: " + mo17221x833fcbd0);
                        }
                        s(f18, bVar.f125769g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f125787c;
        java.util.List mo17224x68d3ead = aVar.mo17224x68d3ead();
        int size = mo17224x68d3ead.size();
        for (int i18 = iArr != null ? iArr[i17] : 0; i18 < size; i18++) {
            com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b bVar2 = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.b) mo17224x68d3ead.get(i18);
            int i19 = bVar2.f125770h;
            for (int i27 = 0; i27 < i19; i27++) {
                int i28 = bVar2.f125777o + i27;
                if (i27 < aVar.mo17222x3b739e0d() && (f17 = aVar.f(i28)) != null && f17.getVisibility() != 8) {
                    com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc interfaceC1624x6bcaaecc = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.InterfaceC1624x6bcaaecc) f17.getLayoutParams();
                    if (interfaceC1624x6bcaaecc.mo17202x68c1413b() == -1 || interfaceC1624x6bcaaecc.mo17202x68c1413b() == 4) {
                        if (mo17221x833fcbd0 == 0 || mo17221x833fcbd0 == 1) {
                            t(f17, bVar2.f125769g, i28);
                        } else {
                            if (mo17221x833fcbd0 != 2 && mo17221x833fcbd0 != 3) {
                                throw new java.lang.IllegalArgumentException("Invalid flex direction: " + mo17221x833fcbd0);
                            }
                            s(f17, bVar2.f125769g, i28);
                        }
                    }
                }
            }
        }
    }

    public final void v(int i17, int i18, int i19, android.view.View view) {
        long[] jArr = this.f125788d;
        if (jArr != null) {
            jArr[i17] = (i18 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | (i19 << 32);
        }
        long[] jArr2 = this.f125789e;
        if (jArr2 != null) {
            jArr2[i17] = (view.getMeasuredWidth() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | (view.getMeasuredHeight() << 32);
        }
    }
}
