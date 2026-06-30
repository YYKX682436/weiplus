package androidx.constraintlayout.widget;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10982b = {0, 4, 8};

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.SparseIntArray f10983c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f10984a = new java.util.HashMap();

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        f10983c = sparseIntArray;
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_editor_absoluteX, 6);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_editor_absoluteY, 7);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintGuide_begin, 17);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintGuide_end, 18);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintGuide_percent, 19);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_orientation, 27);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_goneMarginLeft, 13);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_goneMarginTop, 16);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_goneMarginRight, 14);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_goneMarginBottom, 11);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_goneMarginStart, 15);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_goneMarginEnd, 12);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintVertical_weight, 40);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintVertical_bias, 37);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintLeft_creator, 75);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintTop_creator, 75);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintRight_creator, 75);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintBottom_creator, 75);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintBaseline_creator, 75);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_layout_marginLeft, 24);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_layout_marginRight, 28);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_layout_marginStart, 31);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_layout_marginEnd, 8);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_layout_marginTop, 34);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_layout_marginBottom, 2);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_layout_width, 23);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_layout_height, 21);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_visibility, 22);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_alpha, 43);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_elevation, 44);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_rotationX, 45);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_rotationY, 46);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_rotation, 60);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_scaleX, 47);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_scaleY, 48);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_transformPivotX, 49);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_transformPivotY, 50);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_translationX, 51);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_translationY, 52);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_translationZ, 53);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintWidth_default, 54);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintHeight_default, 55);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintWidth_max, 56);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintHeight_max, 57);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintWidth_min, 58);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintHeight_min, 59);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintCircle, 61);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintCircleRadius, 62);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintCircleAngle, 63);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_android_id, 38);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintWidth_percent, 69);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_layout_constraintHeight_percent, 70);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_chainUseRtl, 71);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_barrierDirection, 72);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_constraint_referenced_ids, 73);
        sparseIntArray.append(androidx.constraintlayout.widget.R$styleable.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    public static int k(android.content.res.TypedArray typedArray, int i17, int i18) {
        int resourceId = typedArray.getResourceId(i17, i18);
        return resourceId == -1 ? typedArray.getInt(i17, -1) : resourceId;
    }

    public void a(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    public void b(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int i17;
        int childCount = constraintLayout.getChildCount();
        java.util.HashMap hashMap = this.f10984a;
        java.util.HashSet hashSet = new java.util.HashSet(hashMap.keySet());
        int i18 = 0;
        while (i18 < childCount) {
            android.view.View childAt = constraintLayout.getChildAt(i18);
            int id6 = childAt.getId();
            if (id6 == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (hashMap.containsKey(java.lang.Integer.valueOf(id6))) {
                hashSet.remove(java.lang.Integer.valueOf(id6));
                androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) hashMap.get(java.lang.Integer.valueOf(id6));
                if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                    bVar.f10973t0 = 1;
                }
                int i19 = bVar.f10973t0;
                if (i19 != -1 && i19 == 1) {
                    androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                    barrier.setId(id6);
                    barrier.setType(bVar.f10971s0);
                    barrier.setAllowsGoneWidget(bVar.f10969r0);
                    int[] iArr = bVar.f10975u0;
                    if (iArr != null) {
                        barrier.setReferencedIds(iArr);
                    } else {
                        java.lang.String str = bVar.f10977v0;
                        if (str != null) {
                            int[] g17 = g(barrier, str);
                            bVar.f10975u0 = g17;
                            barrier.setReferencedIds(g17);
                        }
                    }
                }
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                bVar.a(layoutParams);
                childAt.setLayoutParams(layoutParams);
                int i27 = bVar.f10933J;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i27));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "androidx/constraintlayout/widget/ConstraintSet", "applyToInternal", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "androidx/constraintlayout/widget/ConstraintSet", "applyToInternal", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                float f17 = bVar.U;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(f17));
                java.util.Collections.reverse(arrayList2);
                i17 = childCount;
                yj0.a.d(childAt, arrayList2.toArray(), "androidx/constraintlayout/widget/ConstraintSet", "applyToInternal", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(childAt, "androidx/constraintlayout/widget/ConstraintSet", "applyToInternal", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                childAt.setRotation(bVar.X);
                childAt.setRotationX(bVar.Y);
                childAt.setRotationY(bVar.Z);
                childAt.setScaleX(bVar.f10935a0);
                childAt.setScaleY(bVar.f10937b0);
                if (!java.lang.Float.isNaN(bVar.f10939c0)) {
                    childAt.setPivotX(bVar.f10939c0);
                }
                if (!java.lang.Float.isNaN(bVar.f10941d0)) {
                    childAt.setPivotY(bVar.f10941d0);
                }
                childAt.setTranslationX(bVar.f10943e0);
                childAt.setTranslationY(bVar.f10945f0);
                childAt.setTranslationZ(bVar.f10947g0);
                if (bVar.V) {
                    childAt.setElevation(bVar.W);
                }
            } else {
                i17 = childCount;
            }
            i18++;
            childCount = i17;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) hashMap.get(num);
            int i28 = bVar2.f10973t0;
            if (i28 != -1 && i28 == 1) {
                androidx.constraintlayout.widget.Barrier barrier2 = new androidx.constraintlayout.widget.Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = bVar2.f10975u0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    java.lang.String str2 = bVar2.f10977v0;
                    if (str2 != null) {
                        int[] g18 = g(barrier2, str2);
                        bVar2.f10975u0 = g18;
                        barrier2.setReferencedIds(g18);
                    }
                }
                barrier2.setType(bVar2.f10971s0);
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
                barrier2.e();
                bVar2.a(layoutParams2);
                constraintLayout.addView(barrier2, layoutParams2);
            }
            if (bVar2.f10934a) {
                android.view.View guideline = new androidx.constraintlayout.widget.Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams3 = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-2, -2);
                bVar2.a(layoutParams3);
                constraintLayout.addView(guideline, layoutParams3);
            }
        }
    }

    public void c(int i17, int i18) {
        java.util.HashMap hashMap = this.f10984a;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) hashMap.get(java.lang.Integer.valueOf(i17));
            switch (i18) {
                case 1:
                    bVar.f10950i = -1;
                    bVar.f10948h = -1;
                    bVar.D = -1;
                    bVar.K = -1;
                    return;
                case 2:
                    bVar.f10954k = -1;
                    bVar.f10952j = -1;
                    bVar.E = -1;
                    bVar.M = -1;
                    return;
                case 3:
                    bVar.f10958m = -1;
                    bVar.f10956l = -1;
                    bVar.F = -1;
                    bVar.L = -1;
                    return;
                case 4:
                    bVar.f10960n = -1;
                    bVar.f10962o = -1;
                    bVar.G = -1;
                    bVar.N = -1;
                    return;
                case 5:
                    bVar.f10964p = -1;
                    return;
                case 6:
                    bVar.f10966q = -1;
                    bVar.f10968r = -1;
                    bVar.I = -1;
                    bVar.P = -1;
                    return;
                case 7:
                    bVar.f10970s = -1;
                    bVar.f10972t = -1;
                    bVar.H = -1;
                    bVar.O = -1;
                    return;
                default:
                    throw new java.lang.IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void d(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        java.util.HashMap hashMap = this.f10984a;
        hashMap.clear();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = constraintLayout.getChildAt(i17);
            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id6 = childAt.getId();
            if (id6 == -1) {
                throw new java.lang.RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(java.lang.Integer.valueOf(id6))) {
                hashMap.put(java.lang.Integer.valueOf(id6), new androidx.constraintlayout.widget.b());
            }
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) hashMap.get(java.lang.Integer.valueOf(id6));
            bVar.b(id6, layoutParams);
            bVar.f10933J = childAt.getVisibility();
            bVar.U = childAt.getAlpha();
            bVar.X = childAt.getRotation();
            bVar.Y = childAt.getRotationX();
            bVar.Z = childAt.getRotationY();
            bVar.f10935a0 = childAt.getScaleX();
            bVar.f10937b0 = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                bVar.f10939c0 = pivotX;
                bVar.f10941d0 = pivotY;
            }
            bVar.f10943e0 = childAt.getTranslationX();
            bVar.f10945f0 = childAt.getTranslationY();
            bVar.f10947g0 = childAt.getTranslationZ();
            if (bVar.V) {
                bVar.W = childAt.getElevation();
            }
            if (childAt instanceof androidx.constraintlayout.widget.Barrier) {
                androidx.constraintlayout.widget.Barrier barrier = (androidx.constraintlayout.widget.Barrier) childAt;
                bVar.f10969r0 = barrier.f10857n.f432604m0;
                bVar.f10975u0 = barrier.getReferencedIds();
                bVar.f10971s0 = barrier.getType();
            }
        }
    }

    public void e(int i17, int i18, int i19, int i27) {
        java.util.HashMap hashMap = this.f10984a;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            hashMap.put(java.lang.Integer.valueOf(i17), new androidx.constraintlayout.widget.b());
        }
        androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) hashMap.get(java.lang.Integer.valueOf(i17));
        switch (i18) {
            case 1:
                if (i27 == 1) {
                    bVar.f10948h = i19;
                    bVar.f10950i = -1;
                    return;
                } else if (i27 == 2) {
                    bVar.f10950i = i19;
                    bVar.f10948h = -1;
                    return;
                } else {
                    throw new java.lang.IllegalArgumentException("left to " + o(i27) + " undefined");
                }
            case 2:
                if (i27 == 1) {
                    bVar.f10952j = i19;
                    bVar.f10954k = -1;
                    return;
                } else if (i27 == 2) {
                    bVar.f10954k = i19;
                    bVar.f10952j = -1;
                    return;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + o(i27) + " undefined");
                }
            case 3:
                if (i27 == 3) {
                    bVar.f10956l = i19;
                    bVar.f10958m = -1;
                    bVar.f10964p = -1;
                    return;
                } else if (i27 == 4) {
                    bVar.f10958m = i19;
                    bVar.f10956l = -1;
                    bVar.f10964p = -1;
                    return;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + o(i27) + " undefined");
                }
            case 4:
                if (i27 == 4) {
                    bVar.f10962o = i19;
                    bVar.f10960n = -1;
                    bVar.f10964p = -1;
                    return;
                } else if (i27 == 3) {
                    bVar.f10960n = i19;
                    bVar.f10962o = -1;
                    bVar.f10964p = -1;
                    return;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + o(i27) + " undefined");
                }
            case 5:
                if (i27 != 5) {
                    throw new java.lang.IllegalArgumentException("right to " + o(i27) + " undefined");
                }
                bVar.f10964p = i19;
                bVar.f10962o = -1;
                bVar.f10960n = -1;
                bVar.f10956l = -1;
                bVar.f10958m = -1;
                return;
            case 6:
                if (i27 == 6) {
                    bVar.f10968r = i19;
                    bVar.f10966q = -1;
                    return;
                } else if (i27 == 7) {
                    bVar.f10966q = i19;
                    bVar.f10968r = -1;
                    return;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + o(i27) + " undefined");
                }
            case 7:
                if (i27 == 7) {
                    bVar.f10972t = i19;
                    bVar.f10970s = -1;
                    return;
                } else if (i27 == 6) {
                    bVar.f10970s = i19;
                    bVar.f10972t = -1;
                    return;
                } else {
                    throw new java.lang.IllegalArgumentException("right to " + o(i27) + " undefined");
                }
            default:
                throw new java.lang.IllegalArgumentException(o(i18) + " to " + o(i27) + " unknown");
        }
    }

    public void f(int i17, int i18, int i19, int i27, int i28) {
        java.util.HashMap hashMap = this.f10984a;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            hashMap.put(java.lang.Integer.valueOf(i17), new androidx.constraintlayout.widget.b());
        }
        androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) hashMap.get(java.lang.Integer.valueOf(i17));
        switch (i18) {
            case 1:
                if (i27 == 1) {
                    bVar.f10948h = i19;
                    bVar.f10950i = -1;
                } else {
                    if (i27 != 2) {
                        throw new java.lang.IllegalArgumentException("Left to " + o(i27) + " undefined");
                    }
                    bVar.f10950i = i19;
                    bVar.f10948h = -1;
                }
                bVar.D = i28;
                return;
            case 2:
                if (i27 == 1) {
                    bVar.f10952j = i19;
                    bVar.f10954k = -1;
                } else {
                    if (i27 != 2) {
                        throw new java.lang.IllegalArgumentException("right to " + o(i27) + " undefined");
                    }
                    bVar.f10954k = i19;
                    bVar.f10952j = -1;
                }
                bVar.E = i28;
                return;
            case 3:
                if (i27 == 3) {
                    bVar.f10956l = i19;
                    bVar.f10958m = -1;
                    bVar.f10964p = -1;
                } else {
                    if (i27 != 4) {
                        throw new java.lang.IllegalArgumentException("right to " + o(i27) + " undefined");
                    }
                    bVar.f10958m = i19;
                    bVar.f10956l = -1;
                    bVar.f10964p = -1;
                }
                bVar.F = i28;
                return;
            case 4:
                if (i27 == 4) {
                    bVar.f10962o = i19;
                    bVar.f10960n = -1;
                    bVar.f10964p = -1;
                } else {
                    if (i27 != 3) {
                        throw new java.lang.IllegalArgumentException("right to " + o(i27) + " undefined");
                    }
                    bVar.f10960n = i19;
                    bVar.f10962o = -1;
                    bVar.f10964p = -1;
                }
                bVar.G = i28;
                return;
            case 5:
                if (i27 != 5) {
                    throw new java.lang.IllegalArgumentException("right to " + o(i27) + " undefined");
                }
                bVar.f10964p = i19;
                bVar.f10962o = -1;
                bVar.f10960n = -1;
                bVar.f10956l = -1;
                bVar.f10958m = -1;
                return;
            case 6:
                if (i27 == 6) {
                    bVar.f10968r = i19;
                    bVar.f10966q = -1;
                } else {
                    if (i27 != 7) {
                        throw new java.lang.IllegalArgumentException("right to " + o(i27) + " undefined");
                    }
                    bVar.f10966q = i19;
                    bVar.f10968r = -1;
                }
                bVar.I = i28;
                return;
            case 7:
                if (i27 == 7) {
                    bVar.f10972t = i19;
                    bVar.f10970s = -1;
                } else {
                    if (i27 != 6) {
                        throw new java.lang.IllegalArgumentException("right to " + o(i27) + " undefined");
                    }
                    bVar.f10970s = i19;
                    bVar.f10972t = -1;
                }
                bVar.H = i28;
                return;
            default:
                throw new java.lang.IllegalArgumentException(o(i18) + " to " + o(i27) + " unknown");
        }
    }

    public final int[] g(android.view.View view, java.lang.String str) {
        int i17;
        java.util.HashMap hashMap;
        java.lang.String[] split = str.split(",");
        android.content.Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i18 = 0;
        int i19 = 0;
        while (i18 < split.length) {
            java.lang.String trim = split[i18].trim();
            java.lang.Object obj = null;
            try {
                i17 = androidx.constraintlayout.widget.R$id.class.getField(trim).getInt(null);
            } catch (java.lang.Exception unused) {
                i17 = 0;
            }
            if (i17 == 0) {
                i17 = context.getResources().getIdentifier(trim, dm.i4.COL_ID, context.getPackageName());
            }
            if (i17 == 0 && view.isInEditMode() && (view.getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout)) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view.getParent();
                constraintLayout.getClass();
                if ((trim instanceof java.lang.String) && (hashMap = constraintLayout.f10875s) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f10875s.get(trim);
                }
                if (obj != null && (obj instanceof java.lang.Integer)) {
                    i17 = ((java.lang.Integer) obj).intValue();
                }
            }
            iArr[i19] = i17;
            i18++;
            i19++;
        }
        return i19 != split.length ? java.util.Arrays.copyOf(iArr, i19) : iArr;
    }

    public final androidx.constraintlayout.widget.b h(android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R$styleable.ConstraintSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i17 = 0; i17 < indexCount; i17++) {
            int index = obtainStyledAttributes.getIndex(i17);
            android.util.SparseIntArray sparseIntArray = f10983c;
            int i18 = sparseIntArray.get(index);
            switch (i18) {
                case 1:
                    bVar.f10964p = k(obtainStyledAttributes, index, bVar.f10964p);
                    break;
                case 2:
                    bVar.G = obtainStyledAttributes.getDimensionPixelSize(index, bVar.G);
                    break;
                case 3:
                    bVar.f10962o = k(obtainStyledAttributes, index, bVar.f10962o);
                    break;
                case 4:
                    bVar.f10960n = k(obtainStyledAttributes, index, bVar.f10960n);
                    break;
                case 5:
                    bVar.f10978w = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    bVar.A = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.A);
                    break;
                case 7:
                    bVar.B = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.B);
                    break;
                case 8:
                    bVar.H = obtainStyledAttributes.getDimensionPixelSize(index, bVar.H);
                    break;
                case 9:
                    bVar.f10972t = k(obtainStyledAttributes, index, bVar.f10972t);
                    break;
                case 10:
                    bVar.f10970s = k(obtainStyledAttributes, index, bVar.f10970s);
                    break;
                case 11:
                    bVar.N = obtainStyledAttributes.getDimensionPixelSize(index, bVar.N);
                    break;
                case 12:
                    bVar.O = obtainStyledAttributes.getDimensionPixelSize(index, bVar.O);
                    break;
                case 13:
                    bVar.K = obtainStyledAttributes.getDimensionPixelSize(index, bVar.K);
                    break;
                case 14:
                    bVar.M = obtainStyledAttributes.getDimensionPixelSize(index, bVar.M);
                    break;
                case 15:
                    bVar.P = obtainStyledAttributes.getDimensionPixelSize(index, bVar.P);
                    break;
                case 16:
                    bVar.L = obtainStyledAttributes.getDimensionPixelSize(index, bVar.L);
                    break;
                case 17:
                    bVar.f10942e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f10942e);
                    break;
                case 18:
                    bVar.f10944f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar.f10944f);
                    break;
                case 19:
                    bVar.f10946g = obtainStyledAttributes.getFloat(index, bVar.f10946g);
                    break;
                case 20:
                    bVar.f10974u = obtainStyledAttributes.getFloat(index, bVar.f10974u);
                    break;
                case 21:
                    bVar.f10938c = obtainStyledAttributes.getLayoutDimension(index, bVar.f10938c);
                    break;
                case 22:
                    bVar.f10933J = f10982b[obtainStyledAttributes.getInt(index, bVar.f10933J)];
                    break;
                case 23:
                    bVar.f10936b = obtainStyledAttributes.getLayoutDimension(index, bVar.f10936b);
                    break;
                case 24:
                    bVar.D = obtainStyledAttributes.getDimensionPixelSize(index, bVar.D);
                    break;
                case 25:
                    bVar.f10948h = k(obtainStyledAttributes, index, bVar.f10948h);
                    break;
                case 26:
                    bVar.f10950i = k(obtainStyledAttributes, index, bVar.f10950i);
                    break;
                case 27:
                    bVar.C = obtainStyledAttributes.getInt(index, bVar.C);
                    break;
                case 28:
                    bVar.E = obtainStyledAttributes.getDimensionPixelSize(index, bVar.E);
                    break;
                case 29:
                    bVar.f10952j = k(obtainStyledAttributes, index, bVar.f10952j);
                    break;
                case 30:
                    bVar.f10954k = k(obtainStyledAttributes, index, bVar.f10954k);
                    break;
                case 31:
                    bVar.I = obtainStyledAttributes.getDimensionPixelSize(index, bVar.I);
                    break;
                case 32:
                    bVar.f10966q = k(obtainStyledAttributes, index, bVar.f10966q);
                    break;
                case 33:
                    bVar.f10968r = k(obtainStyledAttributes, index, bVar.f10968r);
                    break;
                case 34:
                    bVar.F = obtainStyledAttributes.getDimensionPixelSize(index, bVar.F);
                    break;
                case 35:
                    bVar.f10958m = k(obtainStyledAttributes, index, bVar.f10958m);
                    break;
                case 36:
                    bVar.f10956l = k(obtainStyledAttributes, index, bVar.f10956l);
                    break;
                case 37:
                    bVar.f10976v = obtainStyledAttributes.getFloat(index, bVar.f10976v);
                    break;
                case 38:
                    bVar.f10940d = obtainStyledAttributes.getResourceId(index, bVar.f10940d);
                    break;
                case 39:
                    bVar.R = obtainStyledAttributes.getFloat(index, bVar.R);
                    break;
                case 40:
                    bVar.Q = obtainStyledAttributes.getFloat(index, bVar.Q);
                    break;
                case 41:
                    bVar.S = obtainStyledAttributes.getInt(index, bVar.S);
                    break;
                case 42:
                    bVar.T = obtainStyledAttributes.getInt(index, bVar.T);
                    break;
                case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                    bVar.U = obtainStyledAttributes.getFloat(index, bVar.U);
                    break;
                case 44:
                    bVar.V = true;
                    bVar.W = obtainStyledAttributes.getDimension(index, bVar.W);
                    break;
                case 45:
                    bVar.Y = obtainStyledAttributes.getFloat(index, bVar.Y);
                    break;
                case 46:
                    bVar.Z = obtainStyledAttributes.getFloat(index, bVar.Z);
                    break;
                case 47:
                    bVar.f10935a0 = obtainStyledAttributes.getFloat(index, bVar.f10935a0);
                    break;
                case 48:
                    bVar.f10937b0 = obtainStyledAttributes.getFloat(index, bVar.f10937b0);
                    break;
                case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                    bVar.f10939c0 = obtainStyledAttributes.getFloat(index, bVar.f10939c0);
                    break;
                case 50:
                    bVar.f10941d0 = obtainStyledAttributes.getFloat(index, bVar.f10941d0);
                    break;
                case 51:
                    bVar.f10943e0 = obtainStyledAttributes.getDimension(index, bVar.f10943e0);
                    break;
                case 52:
                    bVar.f10945f0 = obtainStyledAttributes.getDimension(index, bVar.f10945f0);
                    break;
                case 53:
                    bVar.f10947g0 = obtainStyledAttributes.getDimension(index, bVar.f10947g0);
                    break;
                default:
                    switch (i18) {
                        case 60:
                            bVar.X = obtainStyledAttributes.getFloat(index, bVar.X);
                            break;
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                            bVar.f10979x = k(obtainStyledAttributes, index, bVar.f10979x);
                            break;
                        case 62:
                            bVar.f10980y = obtainStyledAttributes.getDimensionPixelSize(index, bVar.f10980y);
                            break;
                        case 63:
                            bVar.f10981z = obtainStyledAttributes.getFloat(index, bVar.f10981z);
                            break;
                        default:
                            switch (i18) {
                                case 69:
                                    bVar.f10965p0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    bVar.f10967q0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    break;
                                case 72:
                                    bVar.f10971s0 = obtainStyledAttributes.getInt(index, bVar.f10971s0);
                                    break;
                                case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
                                    bVar.f10977v0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 74:
                                    bVar.f10969r0 = obtainStyledAttributes.getBoolean(index, bVar.f10969r0);
                                    break;
                                case 75:
                                    java.lang.Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                                default:
                                    java.lang.Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        return bVar;
    }

    public final androidx.constraintlayout.widget.b i(int i17) {
        java.util.HashMap hashMap = this.f10984a;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            hashMap.put(java.lang.Integer.valueOf(i17), new androidx.constraintlayout.widget.b());
        }
        return (androidx.constraintlayout.widget.b) hashMap.get(java.lang.Integer.valueOf(i17));
    }

    public void j(android.content.Context context, int i17) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i17);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    androidx.constraintlayout.widget.b h17 = h(context, android.util.Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        h17.f10934a = true;
                    }
                    this.f10984a.put(java.lang.Integer.valueOf(h17.f10940d), h17);
                }
            }
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
        }
    }

    public void l(int i17, int i18) {
        i(i17).S = i18;
    }

    public void m(int i17, int i18, int i19) {
        androidx.constraintlayout.widget.b i27 = i(i17);
        switch (i18) {
            case 1:
                i27.D = i19;
                return;
            case 2:
                i27.E = i19;
                return;
            case 3:
                i27.F = i19;
                return;
            case 4:
                i27.G = i19;
                return;
            case 5:
                throw new java.lang.IllegalArgumentException("baseline does not support margins");
            case 6:
                i27.I = i19;
                return;
            case 7:
                i27.H = i19;
                return;
            default:
                throw new java.lang.IllegalArgumentException("unknown constraint");
        }
    }

    public void n(int i17, int i18) {
        i(i17).f10933J = i18;
    }

    public final java.lang.String o(int i17) {
        switch (i17) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }
}
