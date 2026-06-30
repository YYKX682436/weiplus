package com.tencent.mm.plugin.clean.ui.fileindexui;

@gm0.a2
@ul5.d(0)
/* loaded from: classes12.dex */
public class CleanChattingNewUI extends com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI {
    public static final /* synthetic */ int S = 0;
    public cw1.u2 M;
    public android.widget.ListView N;
    public java.util.Map Q;
    public final boolean P = !"0".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_clean_new_filters", "0"));
    public long R = 0;

    static {
        l75.e0 e0Var = ot1.h.P;
        l75.e0 e0Var2 = ot1.h.P;
        l75.e0 e0Var3 = ot1.h.P;
        l75.e0 e0Var4 = ot1.h.P;
        l75.e0 e0Var5 = ot1.h.P;
        l75.e0 e0Var6 = ot1.h.P;
        l75.e0 e0Var7 = ot1.h.P;
    }

    @Override // com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI
    public void U6(boolean z17, cw1.b3 b3Var, final com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        final long[] Z6 = Z6();
        mt1.b0 b0Var = mt1.b0.f331191a;
        mt1.b0.f331201k = false;
        wz1.b.b(true);
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List list = this.M.f223349e;
        long j17 = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            cw1.c cVar = (cw1.c) list.get(size);
            if (cVar.f222835d == cVar.f222833b) {
                arrayList.add(cVar.f222832a);
                arrayList2.add(cVar);
                j17 += cVar.f222835d;
            }
        }
        final cw1.x4 x4Var = new cw1.x4(this, !z17, arrayList.size() == this.M.getCount(), j17, b3Var, cancellationSignal);
        ((ku5.t0) ku5.t0.f312615d).a(!z17 ? aw1.n0.b(arrayList2, Y6(z17), Z6[0], Z6[1], true, x4Var, cancellationSignal) : new java.lang.Runnable() { // from class: cw1.w4$$c
            @Override // java.lang.Runnable
            public final void run() {
                java.util.List list2 = arrayList;
                cw1.x4 x4Var2 = x4Var;
                com.tencent.wcdb.support.CancellationSignal cancellationSignal2 = cancellationSignal;
                int i17 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.S;
                c01.f8 f8Var = (c01.f8) i95.n0.c(c01.f8.class);
                long[] jArr = Z6;
                ((yv1.b1) f8Var).wi(list2, x4Var2, jArr[0], jArr[1], false, false, cancellationSignal2);
            }
        });
        yv1.f1 f1Var = yv1.g1.f466040p;
    }

    @Override // com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI
    public void V6() {
        com.tencent.mm.plugin.clean.CleanService$SelectedItems l76 = l7();
        setResult(-1, new android.content.Intent().putExtra("select", l76));
        finish();
        mt1.b0.s(32, 0L, java.lang.Long.valueOf(l76.b()), java.lang.Long.valueOf(l76.a()));
    }

    @Override // com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI
    public void e7(int[] iArr) {
        boolean z17;
        int length = iArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z17 = false;
                break;
            } else {
                if (iArr[i17] != 0) {
                    z17 = true;
                    break;
                }
                i17++;
            }
        }
        if (z17) {
            cw1.u2 u2Var = this.M;
            u2Var.f223349e = java.util.Collections.emptyList();
            u2Var.notifyDataSetChanged();
            X6();
            final com.tencent.mm.plugin.clean.CleanService$SelectedItems l76 = l7();
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: cw1.w4$$l
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    int i18 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.S;
                    return com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.this.j7(l76);
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.x(callable, 0L, "CleanChattingLoad");
        } else {
            ((ku5.t0) ku5.t0.f312615d).b(new java.lang.Runnable() { // from class: cw1.w4$$b
                @Override // java.lang.Runnable
                public final void run() {
                    int i18 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.S;
                    com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.this.m7();
                }
            }, "CleanChattingLoad");
        }
        this.N.setSelection(0);
    }

    @Override // com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI
    public void f7(boolean z17) {
        java.util.Set set;
        cw1.u2 u2Var = this.M;
        if (z17) {
            for (cw1.c cVar : u2Var.f223349e) {
                cVar.f222835d = cVar.f222833b;
                if (cVar.f222837f != null && (set = cVar.f222836e) != null) {
                    cVar.f222837f = set;
                }
            }
        } else {
            for (cw1.c cVar2 : u2Var.f223349e) {
                cVar2.f222835d = 0L;
                if (cVar2.f222837f != null) {
                    cVar2.f222837f = java.util.Collections.emptySet();
                }
            }
        }
        u2Var.notifyDataSetChanged();
        k7();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return this.P ? com.tencent.mm.R.layout.e2r : com.tencent.mm.R.layout.f488623yu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dc, code lost:
    
        if (((r1 != null ? r1.f1() : 8) & 8) != 8) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long[] j7(com.tencent.mm.plugin.clean.CleanService$SelectedItems r36) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.j7(com.tencent.mm.plugin.clean.CleanService$SelectedItems):long[]");
    }

    public final void k7() {
        boolean z17 = !d7() && this.f95714v == 0;
        int i17 = 0;
        long j17 = 0;
        long j18 = 0;
        for (cw1.c cVar : this.M.f223349e) {
            if (cVar != null && cVar.f222835d > 0) {
                long j19 = cVar.f222833b;
                j17 += j19;
                if (z17) {
                    j19 = cVar.f222838g;
                }
                j18 += j19;
                i17++;
            }
        }
        i7(j17, j18, this.M.getCount(), i17, true);
    }

    public final com.tencent.mm.plugin.clean.CleanService$SelectedItems l7() {
        com.tencent.mm.plugin.clean.CleanService$SelectedItems cleanService$SelectedItems = new com.tencent.mm.plugin.clean.CleanService$SelectedItems();
        for (cw1.c cVar : this.M.f223349e) {
            java.util.Set msgIds = cVar.f222837f;
            if (msgIds == null) {
                msgIds = java.util.Collections.emptySet();
            }
            long j17 = cVar.f222835d;
            java.lang.String username = cVar.f222832a;
            kotlin.jvm.internal.o.g(username, "username");
            kotlin.jvm.internal.o.g(msgIds, "msgIds");
            boolean isEmpty = msgIds.isEmpty();
            java.util.HashMap hashMap = cleanService$SelectedItems.f95641d;
            if (isEmpty) {
                hashMap.remove(username);
            } else {
                yv1.p0 p0Var = new yv1.p0();
                java.util.HashSet hashSet = msgIds instanceof java.util.HashSet ? (java.util.HashSet) msgIds : null;
                if (hashSet == null) {
                    hashSet = new java.util.HashSet(msgIds);
                }
                p0Var.f466134b = hashSet;
                p0Var.f466133a = j17;
                hashMap.put(username, p0Var);
            }
        }
        return cleanService$SelectedItems;
    }

    public final void m7() {
        final java.util.ArrayList arrayList = new java.util.ArrayList(this.Q.size());
        for (cw1.c cVar : this.Q.values()) {
            if (cVar.f222833b > 0) {
                arrayList.add(cVar);
            }
        }
        int i17 = this.f95717y;
        java.util.Collections.sort(arrayList, i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? null : new cw1.w4$$j() : new cw1.w4$$i() : new cw1.w4$$h() : new cw1.w4$$g());
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: cw1.w4$$k
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI cleanChattingNewUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.this;
                cw1.u2 u2Var = cleanChattingNewUI.M;
                u2Var.f223349e = arrayList;
                u2Var.notifyDataSetChanged();
                cleanChattingNewUI.N.setVisibility(0);
                cleanChattingNewUI.k7();
            }
        });
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 0 && i18 == -1 && intent != null) {
            final long[] longArrayExtra = intent.getLongArrayExtra("ds");
            intent.getIntArrayExtra("dc");
            if (longArrayExtra != null) {
                for (long j17 : longArrayExtra) {
                    r0 += j17;
                }
            }
            final long j18 = r0;
            this.R += j18;
            setResult(-1, new android.content.Intent().putExtra("tds", this.R));
            java.lang.Runnable runnable = this.F;
            if (runnable != null) {
                runnable.run();
            }
            final java.lang.String stringExtra = intent.getStringExtra("u");
            if (stringExtra == null) {
                return;
            } else {
                ((ku5.t0) ku5.t0.f312615d).b(new java.lang.Runnable() { // from class: cw1.w4$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI cleanChattingNewUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.this;
                        cw1.c cVar = (cw1.c) ((java.util.HashMap) cleanChattingNewUI.Q).get(stringExtra);
                        if (cVar != null && longArrayExtra != null) {
                            cVar.f222833b -= j18;
                        }
                        cleanChattingNewUI.m7();
                    }
                }, "CleanChattingLoad");
            }
        } else if (i17 == 1 && i18 == -1 && intent != null) {
            java.lang.String stringExtra2 = intent.getStringExtra("u");
            if (stringExtra2 == null) {
                return;
            }
            com.tencent.mm.plugin.clean.CleanService$SelectedItems cleanService$SelectedItems = (com.tencent.mm.plugin.clean.CleanService$SelectedItems) intent.getParcelableExtra("select");
            cw1.c cVar = (cw1.c) ((java.util.HashMap) this.Q).get(stringExtra2);
            if (cleanService$SelectedItems != null && cVar != null) {
                yv1.p0 p0Var = (yv1.p0) cleanService$SelectedItems.f95641d.get(stringExtra2);
                cVar.f222835d = p0Var != null ? p0Var.f466133a : 0L;
                cVar.f222837f = cleanService$SelectedItems.c(stringExtra2);
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingUI", "Enter CleanChattingUI, scene = " + this.f95699d);
        getIntent().hasExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        setMMTitle(com.tencent.mm.R.string.a_5);
        boolean d76 = d7();
        android.content.Intent intent = getIntent();
        java.lang.Boolean valueOf = intent.hasExtra("isSent") ? java.lang.Boolean.valueOf(intent.getBooleanExtra("isSent", false)) : null;
        this.f95718z = valueOf;
        if (d76) {
            setMMTitle(valueOf == java.lang.Boolean.TRUE ? com.tencent.mm.R.string.n8j : com.tencent.mm.R.string.n8i);
        } else {
            setMMTitle(com.tencent.mm.R.string.a_5);
        }
        final com.tencent.mm.plugin.clean.CleanService$SelectedItems cleanService$SelectedItems = d76 ? (com.tencent.mm.plugin.clean.CleanService$SelectedItems) intent.getParcelableExtra("select") : null;
        this.N = (android.widget.ListView) this.f95706n;
        cw1.u2 u2Var = new cw1.u2(this);
        this.M = u2Var;
        this.N.setAdapter((android.widget.ListAdapter) u2Var);
        this.N.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() { // from class: cw1.w4$$d
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
                java.util.Set set;
                int i18 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.S;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI cleanChattingNewUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.this;
                cleanChattingNewUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", cleanChattingNewUI, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(adapterView);
                arrayList2.add(view);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", cleanChattingNewUI, array2);
                cw1.u2 u2Var2 = cleanChattingNewUI.M;
                cw1.c cVar = (cw1.c) u2Var2.f223349e.get(i17);
                if (cVar.f222835d > 0) {
                    cVar.f222835d = 0L;
                    if (cVar.f222837f != null) {
                        cVar.f222837f = java.util.Collections.emptySet();
                    }
                } else {
                    cVar.f222835d = cVar.f222833b;
                    if (cVar.f222837f != null && (set = cVar.f222836e) != null) {
                        cVar.f222837f = set;
                    }
                }
                u2Var2.notifyDataSetChanged();
                cleanChattingNewUI.k7();
                yj0.a.h(cleanChattingNewUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                yj0.a.h(cleanChattingNewUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        });
        this.M.f223350f = new android.widget.AdapterView.OnItemClickListener() { // from class: cw1.w4$$e
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
                int i18 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.S;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI cleanChattingNewUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.this;
                cleanChattingNewUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", cleanChattingNewUI, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(adapterView);
                arrayList2.add(view);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", cleanChattingNewUI, array2);
                cw1.c item = cleanChattingNewUI.M.getItem(i17);
                if (item != null) {
                    if (item.f222833b > 0) {
                        long[] Z6 = cleanChattingNewUI.Z6();
                        int i19 = 1;
                        android.content.Intent putExtra = new android.content.Intent(cleanChattingNewUI, (java.lang.Class<?>) com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI.class).putExtra("u", item.f222832a).putExtra("st", cleanChattingNewUI.Y6(true)).putExtra("min", Z6[0]).putExtra("max", Z6[1]);
                        lk5.s.e(putExtra, true);
                        java.lang.Boolean bool = cleanChattingNewUI.f95718z;
                        if (bool != null) {
                            putExtra.putExtra("isSent", bool.booleanValue());
                        }
                        if (cleanChattingNewUI.B) {
                            putExtra.putExtra("onlyInSys", true);
                        }
                        if (cleanChattingNewUI.d7()) {
                            putExtra.putExtra("select", cleanChattingNewUI.l7());
                            putExtra.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
                        } else {
                            putExtra.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
                            i19 = 0;
                        }
                        putExtra.putExtra("clean_ui_scene", cleanChattingNewUI.f95700e);
                        cleanChattingNewUI.startActivityForResult(putExtra, i19);
                        mt1.b0.s(8, 0L, new java.lang.Long[0]);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("select_detail_chat_history", "view_clk", java.util.Collections.singletonMap("storage_manage_sessionid", cleanChattingNewUI.f95713u.f466043b), 32903);
                    } else {
                        db5.e1.i(cleanChattingNewUI, com.tencent.mm.R.string.b8v, com.tencent.mm.R.string.jz9);
                    }
                }
                yj0.a.h(cleanChattingNewUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                yj0.a.h(cleanChattingNewUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        };
        this.f95714v = 0;
        if (this.P) {
            c7(true, this.f95718z == null, true);
        } else {
            b7(true, true);
        }
        X6();
        ((ku5.t0) ku5.t0.f312615d).b(new java.lang.Runnable() { // from class: cw1.w4$$f
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.S;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI cleanChattingNewUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.this;
                cleanChattingNewUI.getClass();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long[] j76 = cleanChattingNewUI.j7(cleanService$SelectedItems);
                mt1.b0.s(22, java.lang.System.currentTimeMillis() - currentTimeMillis, java.lang.Long.valueOf(j76[0] + j76[1]), java.lang.Long.valueOf(j76[0]), java.lang.Long.valueOf(j76[2]), java.lang.Long.valueOf(((java.util.HashMap) cleanChattingNewUI.Q).size()));
            }
        }, "CleanChattingLoad");
    }
}
