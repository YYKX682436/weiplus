package c43;

/* loaded from: classes15.dex */
public final class h extends c43.x {
    public x33.b Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.view.View itemView, int i17) {
        super(itemView, i17);
        kotlin.jvm.internal.o.g(itemView, "itemView");
    }

    public final x33.b C() {
        x33.b bVar = this.Z;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.o.o("binding");
        throw null;
    }

    @Override // c43.x
    public void k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard chatroomMsgSheetCard;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgSheetCard = msgContent.chatroom_sheet_card) == null) {
            return;
        }
        C().f451622j.setText(chatroomMsgSheetCard.title);
        r53.v vVar = new r53.v();
        vVar.f392707e = false;
        r53.w a17 = vVar.a();
        r53.y.a().e(C().f451615c, chatroomMsgSheetCard.pic_url, a17, null);
        java.lang.String str = chatroomMsgSheetCard.bg_pic_url;
        if (str != null) {
            r53.y.a().e(null, str, a17, new c43.g(this));
        }
        java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.SheetRow> linkedList = chatroomMsgSheetCard.sheet_row_list;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.SheetRow> sheet_row_list = chatroomMsgSheetCard.sheet_row_list;
        kotlin.jvm.internal.o.f(sheet_row_list, "sheet_row_list");
        int i17 = 0;
        for (java.lang.Object obj : sheet_row_list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.game.autogen.chatroom.SheetRow sheetRow = (com.tencent.mm.plugin.game.autogen.chatroom.SheetRow) obj;
            if (i17 == 0) {
                java.util.LinkedList<java.lang.String> linkedList2 = sheetRow.sheet_col_list;
                if (linkedList2 != null) {
                    int i19 = 0;
                    for (java.lang.Object obj2 : linkedList2) {
                        int i27 = i19 + 1;
                        if (i19 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        java.lang.String str2 = (java.lang.String) obj2;
                        if (i19 == 0) {
                            C().f451619g.setText(str2);
                        } else if (i19 == 1) {
                            C().f451620h.setText(str2);
                        } else if (i19 == 2) {
                            C().f451621i.setText(str2);
                        }
                        i19 = i27;
                    }
                } else {
                    continue;
                }
            } else {
                java.util.LinkedList<java.lang.String> linkedList3 = sheetRow.sheet_col_list;
                if (linkedList3 != null) {
                    int i28 = 0;
                    for (java.lang.Object obj3 : linkedList3) {
                        int i29 = i28 + 1;
                        if (i28 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        java.lang.String str3 = (java.lang.String) obj3;
                        if (i28 == 0) {
                            C().f451616d.setText(str3);
                        } else if (i28 == 1) {
                            C().f451617e.setText(str3);
                        } else if (i28 == 2) {
                            C().f451618f.setText(str3);
                        }
                        i28 = i29;
                    }
                } else {
                    continue;
                }
            }
            i17 = i18;
        }
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f38492g).inflate(com.tencent.mm.R.layout.bet, (android.view.ViewGroup) null, false);
        int i17 = com.tencent.mm.R.id.goc;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(inflate, com.tencent.mm.R.id.goc);
        if (relativeLayout != null) {
            i17 = com.tencent.mm.R.id.god;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.god);
            if (linearLayout != null) {
                i17 = com.tencent.mm.R.id.goe;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.goe);
                if (linearLayout2 != null) {
                    i17 = com.tencent.mm.R.id.hle;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.hle);
                    if (imageView != null) {
                        i17 = com.tencent.mm.R.id.omy;
                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.omy);
                        if (textView != null) {
                            i17 = com.tencent.mm.R.id.omz;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.omz);
                            if (textView2 != null) {
                                i17 = com.tencent.mm.R.id.f487434on0;
                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f487434on0);
                                if (textView3 != null) {
                                    i17 = com.tencent.mm.R.id.f487435on1;
                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f487435on1);
                                    if (textView4 != null) {
                                        i17 = com.tencent.mm.R.id.f487436on2;
                                        android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f487436on2);
                                        if (textView5 != null) {
                                            i17 = com.tencent.mm.R.id.f487437on3;
                                            android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f487437on3);
                                            if (textView6 != null) {
                                                i17 = com.tencent.mm.R.id.f487438on4;
                                                android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f487438on4);
                                                if (textView7 != null) {
                                                    this.Z = new x33.b((android.widget.FrameLayout) inflate, relativeLayout, linearLayout, linearLayout2, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                    android.widget.FrameLayout frameLayout = C().f451613a;
                                                    kotlin.jvm.internal.o.f(frameLayout, "getRoot(...)");
                                                    return frameLayout;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.tencent.mm.plugin.game.autogen.chatroom.MsgContent msgContent;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgSheetCard chatroomMsgSheetCard;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack chatroomMsgPack = this.f38495m;
        if (chatroomMsgPack == null || (msgContent = chatroomMsgPack.msg_content) == null || (chatroomMsgSheetCard = msgContent.chatroom_sheet_card) == null || s()) {
            return;
        }
        s33.y.h(this.f38492g, chatroomMsgSheetCard.jump_info);
    }
}
