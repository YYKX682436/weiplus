package bd4;

/* loaded from: classes4.dex */
public final class l1 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f19365a;

    public l1(bd4.f2 f2Var) {
        this.f19365a = f2Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x010a. Please report as an issue. */
    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("OnCreateContextMMMenu", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$buildInnerMenu$1");
        g4Var.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMenuCreateListener$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        bd4.f2 f2Var = this.f19365a;
        android.view.View.OnCreateContextMenuListener onCreateContextMenuListener = f2Var.f19323d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMenuCreateListener$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (onCreateContextMenuListener != null) {
            onCreateContextMenuListener.onCreateContextMenu(g4Var, bd4.f2.a(f2Var), contextMenuInfo);
        }
        boolean q17 = f2Var.q();
        java.util.List<android.view.MenuItem> list = g4Var.f228344d;
        if (!q17) {
            db5.h4 h4Var = new db5.h4(bd4.f2.b(f2Var), 38, 0);
            h4Var.f228368i = bd4.f2.b(f2Var).getString(com.tencent.mm.R.string.f492532gv1);
            h4Var.setIcon(com.tencent.mm.R.raw.icons_filled_allselect);
            kotlin.jvm.internal.o.d(list);
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            java.util.Iterator it = arrayList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                android.view.MenuItem menuItem = (android.view.MenuItem) it.next();
                if (menuItem.getItemId() == 0 || menuItem.getItemId() == 11) {
                    break;
                } else {
                    i18++;
                }
            }
            arrayList.add(i18 >= 0 ? i18 + 1 : 0, h4Var);
        }
        if (!f2Var.q()) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            int size = arrayList2.size();
            for (int i19 = 0; i19 < size; i19++) {
                android.view.MenuItem menuItem2 = (android.view.MenuItem) arrayList2.get(i19);
                int itemId = menuItem2.getItemId();
                if (itemId == 16) {
                    i17 = 14;
                } else if (itemId == 17) {
                    i17 = 15;
                }
                db5.h4 h4Var2 = new db5.h4(bd4.f2.b(f2Var), i17, menuItem2.getGroupId());
                h4Var2.f228368i = bd4.f2.b(f2Var).getString(com.tencent.mm.R.string.jgl);
                h4Var2.setIcon(com.tencent.mm.R.raw.icons_filled_translate);
                arrayList2.set(i19, h4Var2);
            }
            arrayList2.removeIf(bd4.k1.f19362a);
        }
        kotlin.jvm.internal.o.f(list, "getItemList(...)");
        for (android.view.MenuItem menuItem3 : list) {
            int itemId2 = menuItem3.getItemId();
            if (itemId2 != 0) {
                if (itemId2 == 1) {
                    menuItem3.setIcon(com.tencent.mm.R.raw.icons_filled_favorites);
                } else if (itemId2 == 6) {
                    menuItem3.setIcon(com.tencent.mm.R.raw.exclamation_mark_triangle_filled);
                } else if (itemId2 != 7) {
                    if (itemId2 != 27 && itemId2 != 29) {
                        if (itemId2 != 37) {
                            if (itemId2 != 34 && itemId2 != 35) {
                                switch (itemId2) {
                                    case 13:
                                        menuItem3.setIcon(com.tencent.mm.R.raw.icons_filled_eyes_off);
                                        break;
                                }
                            }
                            menuItem3.setIcon(com.tencent.mm.R.raw.icons_filled_translate);
                        } else {
                            menuItem3.setIcon(com.tencent.mm.R.raw.icons_filled_addsticker);
                        }
                    }
                    menuItem3.setIcon(com.tencent.mm.R.raw.icons_filled_search_logo);
                } else {
                    menuItem3.setIcon(com.tencent.mm.R.raw.icons_filled_delete);
                }
            }
            menuItem3.setIcon(com.tencent.mm.R.raw.icons_filled_copy);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("OnCreateContextMMMenu", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$buildInnerMenu$1");
    }
}
