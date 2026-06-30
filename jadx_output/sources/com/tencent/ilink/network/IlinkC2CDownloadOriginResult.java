package com.tencent.ilink.network;

/* loaded from: classes16.dex */
public class IlinkC2CDownloadOriginResult extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.network.IlinkC2CDownloadOriginResult DEFAULT_INSTANCE = new com.tencent.ilink.network.IlinkC2CDownloadOriginResult();
    private com.tencent.mm.protobuf.g arg_info;
    private long available_bytes;
    private long averageConnectCost;
    private long averageRequestCost;
    private long averageRequestSize;
    private int averageRtt;
    private long averageSpeed;
    private int backup_length;
    private int backup_offset;
    private com.tencent.mm.protobuf.g batch_image_file_key;
    private com.tencent.mm.protobuf.g batch_pic_feedid;
    private com.tencent.mm.protobuf.g client_ip;
    private long connect_cost_ms;
    private boolean crossNet;
    private int cseq_result;
    private long current_filesize;
    private int detail_error_code;
    private com.tencent.mm.protobuf.g detail_error_msg;
    private int detail_error_type;
    private long dns_cost_ms;
    private long enQueueTime;
    private long endTime;
    private int error_code;
    private long file_size;
    private com.tencent.mm.protobuf.g fileid;
    private java.lang.String filekey;
    private com.tencent.mm.protobuf.g filemd5;
    private int filetype;
    private long firstConnectCost;
    private boolean firstRequestCompleted;
    private long firstRequestCost;
    private long firstRequestDownloadSize;
    private long firstRequestSize;
    private com.tencent.mm.protobuf.g httpResponseHeader;
    private int httpStatusCode;
    private boolean is_resumed;
    private boolean is_sns_image_protocol_available;
    private int last_nettype;
    private int last_svrport;
    private boolean moovCompleted;
    private long moovCost;
    private int moovFailReason;
    private int moovRequestTimes;
    private long moovSize;
    private int netConnectTimes;
    private int ori_video_format;
    private com.tencent.mm.protobuf.g pic_cache_path;
    private int pic_index;
    private long previousCompletedSize;
    private boolean private_protocol;
    private com.tencent.mm.protobuf.g profile;
    private long queue_wait_cost_ms;
    private com.tencent.mm.protobuf.g real_used_url;
    private long recvedBytes;
    private com.tencent.mm.protobuf.g recved_video_format;
    private int requestCompletedCount;
    private int requestTimeoutCount;
    private int requestTotalCount;
    private long response_all_cost_ms;
    private long response_wait_cost_ms;
    private com.tencent.mm.protobuf.g server_ip;
    private com.tencent.ilink.network.IlinkC2CSNSVideoProfile snsvideo_profile;
    private com.tencent.ilink.network.IlinkC2CVideoInfo sp_videoinfo;
    private long startTime;
    private int svrFallbackCount;
    private long task_start_time;
    private long trace_id;
    private com.tencent.mm.protobuf.g trace_msg;
    private com.tencent.mm.protobuf.g transfor_msg;
    private int transport_protocol;
    private int transport_protocol_error;
    private long trywrite_bytes;
    private com.tencent.mm.protobuf.g video_cdn_msg;
    private int video_format;
    private com.tencent.mm.protobuf.g xerrno;
    private java.util.LinkedList<com.tencent.mm.protobuf.g> vUsedIp = new java.util.LinkedList<>();
    private java.util.LinkedList<com.tencent.ilink.network.IlinkC2CBatchSnsReqImageData> batch_image_need_retry = new java.util.LinkedList<>();
    private java.util.LinkedList<com.tencent.mm.protobuf.g> backup_listdata = new java.util.LinkedList<>();
    private java.util.LinkedList<com.tencent.ilink.network.IlinkC2CTlvMeta> backup_listmeta = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[82];

    public static com.tencent.ilink.network.IlinkC2CDownloadOriginResult create() {
        return new com.tencent.ilink.network.IlinkC2CDownloadOriginResult();
    }

    public static com.tencent.ilink.network.IlinkC2CDownloadOriginResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.network.IlinkC2CDownloadOriginResult newBuilder() {
        return new com.tencent.ilink.network.IlinkC2CDownloadOriginResult();
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult addAllElementBackupListdata(java.util.Collection<com.tencent.mm.protobuf.g> collection) {
        this.backup_listdata.addAll(collection);
        this.hasSetFields[76] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult addAllElementBackupListmeta(java.util.Collection<com.tencent.ilink.network.IlinkC2CTlvMeta> collection) {
        this.backup_listmeta.addAll(collection);
        this.hasSetFields[77] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult addAllElementBatchImageNeedRetry(java.util.Collection<com.tencent.ilink.network.IlinkC2CBatchSnsReqImageData> collection) {
        this.batch_image_need_retry.addAll(collection);
        this.hasSetFields[62] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult addAllElementVUsedIp(java.util.Collection<com.tencent.mm.protobuf.g> collection) {
        this.vUsedIp.addAll(collection);
        this.hasSetFields[53] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult addElementBackupListdata(com.tencent.mm.protobuf.g gVar) {
        this.backup_listdata.add(gVar);
        this.hasSetFields[76] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult addElementBackupListmeta(com.tencent.ilink.network.IlinkC2CTlvMeta ilinkC2CTlvMeta) {
        this.backup_listmeta.add(ilinkC2CTlvMeta);
        this.hasSetFields[77] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult addElementBatchImageNeedRetry(com.tencent.ilink.network.IlinkC2CBatchSnsReqImageData ilinkC2CBatchSnsReqImageData) {
        this.batch_image_need_retry.add(ilinkC2CBatchSnsReqImageData);
        this.hasSetFields[62] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult addElementVUsedIp(com.tencent.mm.protobuf.g gVar) {
        this.vUsedIp.add(gVar);
        this.hasSetFields[53] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.network.IlinkC2CDownloadOriginResult)) {
            return false;
        }
        com.tencent.ilink.network.IlinkC2CDownloadOriginResult ilinkC2CDownloadOriginResult = (com.tencent.ilink.network.IlinkC2CDownloadOriginResult) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.error_code), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.error_code)) && n51.f.a(java.lang.Integer.valueOf(this.filetype), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.filetype)) && n51.f.a(this.filekey, ilinkC2CDownloadOriginResult.filekey) && n51.f.a(this.arg_info, ilinkC2CDownloadOriginResult.arg_info) && n51.f.a(java.lang.Long.valueOf(this.file_size), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.file_size)) && n51.f.a(this.fileid, ilinkC2CDownloadOriginResult.fileid) && n51.f.a(this.transfor_msg, ilinkC2CDownloadOriginResult.transfor_msg) && n51.f.a(this.trace_msg, ilinkC2CDownloadOriginResult.trace_msg) && n51.f.a(this.filemd5, ilinkC2CDownloadOriginResult.filemd5) && n51.f.a(java.lang.Integer.valueOf(this.video_format), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.video_format)) && n51.f.a(java.lang.Integer.valueOf(this.ori_video_format), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.ori_video_format)) && n51.f.a(this.recved_video_format, ilinkC2CDownloadOriginResult.recved_video_format) && n51.f.a(this.video_cdn_msg, ilinkC2CDownloadOriginResult.video_cdn_msg) && n51.f.a(java.lang.Long.valueOf(this.recvedBytes), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.recvedBytes)) && n51.f.a(java.lang.Long.valueOf(this.enQueueTime), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.enQueueTime)) && n51.f.a(java.lang.Long.valueOf(this.startTime), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.startTime)) && n51.f.a(java.lang.Long.valueOf(this.endTime), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.endTime)) && n51.f.a(java.lang.Long.valueOf(this.firstRequestCost), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.firstRequestCost)) && n51.f.a(java.lang.Long.valueOf(this.firstRequestSize), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.firstRequestSize)) && n51.f.a(java.lang.Long.valueOf(this.firstRequestDownloadSize), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.firstRequestDownloadSize)) && n51.f.a(java.lang.Boolean.valueOf(this.firstRequestCompleted), java.lang.Boolean.valueOf(ilinkC2CDownloadOriginResult.firstRequestCompleted)) && n51.f.a(java.lang.Long.valueOf(this.averageSpeed), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.averageSpeed)) && n51.f.a(java.lang.Long.valueOf(this.averageConnectCost), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.averageConnectCost)) && n51.f.a(java.lang.Long.valueOf(this.firstConnectCost), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.firstConnectCost)) && n51.f.a(java.lang.Integer.valueOf(this.netConnectTimes), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.netConnectTimes)) && n51.f.a(java.lang.Integer.valueOf(this.averageRtt), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.averageRtt)) && n51.f.a(java.lang.Integer.valueOf(this.moovRequestTimes), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.moovRequestTimes)) && n51.f.a(java.lang.Long.valueOf(this.moovCost), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.moovCost)) && n51.f.a(java.lang.Long.valueOf(this.moovSize), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.moovSize)) && n51.f.a(java.lang.Boolean.valueOf(this.moovCompleted), java.lang.Boolean.valueOf(ilinkC2CDownloadOriginResult.moovCompleted)) && n51.f.a(java.lang.Integer.valueOf(this.moovFailReason), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.moovFailReason)) && n51.f.a(java.lang.Long.valueOf(this.previousCompletedSize), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.previousCompletedSize)) && n51.f.a(java.lang.Long.valueOf(this.averageRequestSize), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.averageRequestSize)) && n51.f.a(java.lang.Long.valueOf(this.averageRequestCost), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.averageRequestCost)) && n51.f.a(java.lang.Integer.valueOf(this.requestTotalCount), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.requestTotalCount)) && n51.f.a(java.lang.Integer.valueOf(this.requestCompletedCount), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.requestCompletedCount)) && n51.f.a(java.lang.Integer.valueOf(this.requestTimeoutCount), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.requestTimeoutCount)) && n51.f.a(java.lang.Integer.valueOf(this.svrFallbackCount), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.svrFallbackCount)) && n51.f.a(java.lang.Integer.valueOf(this.httpStatusCode), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.httpStatusCode)) && n51.f.a(this.httpResponseHeader, ilinkC2CDownloadOriginResult.httpResponseHeader) && n51.f.a(this.real_used_url, ilinkC2CDownloadOriginResult.real_used_url) && n51.f.a(java.lang.Long.valueOf(this.dns_cost_ms), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.dns_cost_ms)) && n51.f.a(java.lang.Long.valueOf(this.queue_wait_cost_ms), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.queue_wait_cost_ms)) && n51.f.a(java.lang.Long.valueOf(this.connect_cost_ms), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.connect_cost_ms)) && n51.f.a(java.lang.Long.valueOf(this.response_wait_cost_ms), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.response_wait_cost_ms)) && n51.f.a(java.lang.Long.valueOf(this.response_all_cost_ms), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.response_all_cost_ms)) && n51.f.a(this.client_ip, ilinkC2CDownloadOriginResult.client_ip) && n51.f.a(this.server_ip, ilinkC2CDownloadOriginResult.server_ip) && n51.f.a(this.xerrno, ilinkC2CDownloadOriginResult.xerrno) && n51.f.a(java.lang.Integer.valueOf(this.cseq_result), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.cseq_result)) && n51.f.a(java.lang.Boolean.valueOf(this.crossNet), java.lang.Boolean.valueOf(ilinkC2CDownloadOriginResult.crossNet)) && n51.f.a(java.lang.Boolean.valueOf(this.private_protocol), java.lang.Boolean.valueOf(ilinkC2CDownloadOriginResult.private_protocol)) && n51.f.a(this.vUsedIp, ilinkC2CDownloadOriginResult.vUsedIp) && n51.f.a(java.lang.Integer.valueOf(this.last_svrport), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.last_svrport)) && n51.f.a(java.lang.Integer.valueOf(this.last_nettype), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.last_nettype)) && n51.f.a(java.lang.Boolean.valueOf(this.is_resumed), java.lang.Boolean.valueOf(ilinkC2CDownloadOriginResult.is_resumed)) && n51.f.a(java.lang.Boolean.valueOf(this.is_sns_image_protocol_available), java.lang.Boolean.valueOf(ilinkC2CDownloadOriginResult.is_sns_image_protocol_available)) && n51.f.a(java.lang.Integer.valueOf(this.pic_index), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.pic_index)) && n51.f.a(this.pic_cache_path, ilinkC2CDownloadOriginResult.pic_cache_path) && n51.f.a(this.batch_pic_feedid, ilinkC2CDownloadOriginResult.batch_pic_feedid) && n51.f.a(this.batch_image_file_key, ilinkC2CDownloadOriginResult.batch_image_file_key) && n51.f.a(this.batch_image_need_retry, ilinkC2CDownloadOriginResult.batch_image_need_retry) && n51.f.a(java.lang.Integer.valueOf(this.detail_error_type), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.detail_error_type)) && n51.f.a(java.lang.Integer.valueOf(this.detail_error_code), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.detail_error_code)) && n51.f.a(java.lang.Long.valueOf(this.trywrite_bytes), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.trywrite_bytes)) && n51.f.a(java.lang.Long.valueOf(this.available_bytes), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.available_bytes)) && n51.f.a(java.lang.Long.valueOf(this.current_filesize), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.current_filesize)) && n51.f.a(this.detail_error_msg, ilinkC2CDownloadOriginResult.detail_error_msg) && n51.f.a(java.lang.Integer.valueOf(this.transport_protocol), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.transport_protocol)) && n51.f.a(java.lang.Integer.valueOf(this.transport_protocol_error), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.transport_protocol_error)) && n51.f.a(java.lang.Long.valueOf(this.task_start_time), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.task_start_time)) && n51.f.a(java.lang.Integer.valueOf(this.backup_offset), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.backup_offset)) && n51.f.a(java.lang.Integer.valueOf(this.backup_length), java.lang.Integer.valueOf(ilinkC2CDownloadOriginResult.backup_length)) && n51.f.a(this.backup_listdata, ilinkC2CDownloadOriginResult.backup_listdata) && n51.f.a(this.backup_listmeta, ilinkC2CDownloadOriginResult.backup_listmeta) && n51.f.a(this.snsvideo_profile, ilinkC2CDownloadOriginResult.snsvideo_profile) && n51.f.a(this.sp_videoinfo, ilinkC2CDownloadOriginResult.sp_videoinfo) && n51.f.a(java.lang.Long.valueOf(this.trace_id), java.lang.Long.valueOf(ilinkC2CDownloadOriginResult.trace_id)) && n51.f.a(this.profile, ilinkC2CDownloadOriginResult.profile);
    }

    public com.tencent.mm.protobuf.g getArgInfo() {
        return this.hasSetFields[4] ? this.arg_info : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getAvailableBytes() {
        return this.available_bytes;
    }

    public long getAverageConnectCost() {
        return this.averageConnectCost;
    }

    public long getAverageRequestCost() {
        return this.averageRequestCost;
    }

    public long getAverageRequestSize() {
        return this.averageRequestSize;
    }

    public int getAverageRtt() {
        return this.averageRtt;
    }

    public long getAverageSpeed() {
        return this.averageSpeed;
    }

    public int getBackupLength() {
        return this.backup_length;
    }

    public java.util.LinkedList<com.tencent.mm.protobuf.g> getBackupListdata() {
        return this.backup_listdata;
    }

    public java.util.LinkedList<com.tencent.ilink.network.IlinkC2CTlvMeta> getBackupListmeta() {
        return this.backup_listmeta;
    }

    public int getBackupOffset() {
        return this.backup_offset;
    }

    public com.tencent.mm.protobuf.g getBatchImageFileKey() {
        return this.hasSetFields[61] ? this.batch_image_file_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.util.LinkedList<com.tencent.ilink.network.IlinkC2CBatchSnsReqImageData> getBatchImageNeedRetry() {
        return this.batch_image_need_retry;
    }

    public com.tencent.mm.protobuf.g getBatchPicFeedid() {
        return this.hasSetFields[60] ? this.batch_pic_feedid : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getClientIp() {
        return this.hasSetFields[47] ? this.client_ip : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getConnectCostMs() {
        return this.connect_cost_ms;
    }

    public boolean getCrossNet() {
        return this.crossNet;
    }

    public int getCseqResult() {
        return this.cseq_result;
    }

    public long getCurrentFilesize() {
        return this.current_filesize;
    }

    public int getDetailErrorCode() {
        return this.detail_error_code;
    }

    public com.tencent.mm.protobuf.g getDetailErrorMsg() {
        return this.hasSetFields[68] ? this.detail_error_msg : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getDetailErrorType() {
        return this.detail_error_type;
    }

    public long getDnsCostMs() {
        return this.dns_cost_ms;
    }

    public long getEnQueueTime() {
        return this.enQueueTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public int getErrorCode() {
        return this.error_code;
    }

    public long getFileSize() {
        return this.file_size;
    }

    public com.tencent.mm.protobuf.g getFileid() {
        return this.hasSetFields[6] ? this.fileid : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String getFilekey() {
        return this.hasSetFields[3] ? this.filekey : "";
    }

    public com.tencent.mm.protobuf.g getFilemd5() {
        return this.hasSetFields[9] ? this.filemd5 : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getFiletype() {
        return this.filetype;
    }

    public long getFirstConnectCost() {
        return this.firstConnectCost;
    }

    public boolean getFirstRequestCompleted() {
        return this.firstRequestCompleted;
    }

    public long getFirstRequestCost() {
        return this.firstRequestCost;
    }

    public long getFirstRequestDownloadSize() {
        return this.firstRequestDownloadSize;
    }

    public long getFirstRequestSize() {
        return this.firstRequestSize;
    }

    public com.tencent.mm.protobuf.g getHttpResponseHeader() {
        return this.hasSetFields[40] ? this.httpResponseHeader : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public boolean getIsResumed() {
        return this.is_resumed;
    }

    public boolean getIsSnsImageProtocolAvailable() {
        return this.is_sns_image_protocol_available;
    }

    public int getLastNettype() {
        return this.last_nettype;
    }

    public int getLastSvrport() {
        return this.last_svrport;
    }

    public boolean getMoovCompleted() {
        return this.moovCompleted;
    }

    public long getMoovCost() {
        return this.moovCost;
    }

    public int getMoovFailReason() {
        return this.moovFailReason;
    }

    public int getMoovRequestTimes() {
        return this.moovRequestTimes;
    }

    public long getMoovSize() {
        return this.moovSize;
    }

    public int getNetConnectTimes() {
        return this.netConnectTimes;
    }

    public int getOriVideoFormat() {
        return this.ori_video_format;
    }

    public com.tencent.mm.protobuf.g getPicCachePath() {
        return this.hasSetFields[59] ? this.pic_cache_path : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getPicIndex() {
        return this.pic_index;
    }

    public long getPreviousCompletedSize() {
        return this.previousCompletedSize;
    }

    public boolean getPrivateProtocol() {
        return this.private_protocol;
    }

    public com.tencent.mm.protobuf.g getProfile() {
        return this.hasSetFields[81] ? this.profile : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getQueueWaitCostMs() {
        return this.queue_wait_cost_ms;
    }

    public com.tencent.mm.protobuf.g getRealUsedUrl() {
        return this.hasSetFields[41] ? this.real_used_url : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getRecvedBytes() {
        return this.recvedBytes;
    }

    public com.tencent.mm.protobuf.g getRecvedVideoFormat() {
        return this.hasSetFields[12] ? this.recved_video_format : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getRequestCompletedCount() {
        return this.requestCompletedCount;
    }

    public int getRequestTimeoutCount() {
        return this.requestTimeoutCount;
    }

    public int getRequestTotalCount() {
        return this.requestTotalCount;
    }

    public long getResponseAllCostMs() {
        return this.response_all_cost_ms;
    }

    public long getResponseWaitCostMs() {
        return this.response_wait_cost_ms;
    }

    public com.tencent.mm.protobuf.g getServerIp() {
        return this.hasSetFields[48] ? this.server_ip : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.ilink.network.IlinkC2CSNSVideoProfile getSnsvideoProfile() {
        return this.hasSetFields[78] ? this.snsvideo_profile : com.tencent.ilink.network.IlinkC2CSNSVideoProfile.create();
    }

    public com.tencent.ilink.network.IlinkC2CVideoInfo getSpVideoinfo() {
        return this.hasSetFields[79] ? this.sp_videoinfo : com.tencent.ilink.network.IlinkC2CVideoInfo.create();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getSvrFallbackCount() {
        return this.svrFallbackCount;
    }

    public long getTaskStartTime() {
        return this.task_start_time;
    }

    public long getTraceId() {
        return this.trace_id;
    }

    public com.tencent.mm.protobuf.g getTraceMsg() {
        return this.hasSetFields[8] ? this.trace_msg : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getTransforMsg() {
        return this.hasSetFields[7] ? this.transfor_msg : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getTransportProtocol() {
        return this.transport_protocol;
    }

    public int getTransportProtocolError() {
        return this.transport_protocol_error;
    }

    public long getTrywriteBytes() {
        return this.trywrite_bytes;
    }

    public java.util.LinkedList<com.tencent.mm.protobuf.g> getVUsedIp() {
        return this.vUsedIp;
    }

    public com.tencent.mm.protobuf.g getVideoCdnMsg() {
        return this.hasSetFields[13] ? this.video_cdn_msg : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getVideoFormat() {
        return this.video_format;
    }

    public com.tencent.mm.protobuf.g getXerrno() {
        return this.hasSetFields[49] ? this.xerrno : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasArgInfo() {
        return hasFieldNumber(4);
    }

    public boolean hasAvailableBytes() {
        return hasFieldNumber(66);
    }

    public boolean hasAverageConnectCost() {
        return hasFieldNumber(23);
    }

    public boolean hasAverageRequestCost() {
        return hasFieldNumber(34);
    }

    public boolean hasAverageRequestSize() {
        return hasFieldNumber(33);
    }

    public boolean hasAverageRtt() {
        return hasFieldNumber(26);
    }

    public boolean hasAverageSpeed() {
        return hasFieldNumber(22);
    }

    public boolean hasBackupLength() {
        return hasFieldNumber(75);
    }

    public boolean hasBackupListdata() {
        return hasFieldNumber(76);
    }

    public boolean hasBackupListmeta() {
        return hasFieldNumber(77);
    }

    public boolean hasBackupOffset() {
        return hasFieldNumber(74);
    }

    public boolean hasBatchImageFileKey() {
        return hasFieldNumber(61);
    }

    public boolean hasBatchImageNeedRetry() {
        return hasFieldNumber(62);
    }

    public boolean hasBatchPicFeedid() {
        return hasFieldNumber(60);
    }

    public boolean hasClientIp() {
        return hasFieldNumber(47);
    }

    public boolean hasConnectCostMs() {
        return hasFieldNumber(44);
    }

    public boolean hasCrossNet() {
        return hasFieldNumber(51);
    }

    public boolean hasCseqResult() {
        return hasFieldNumber(50);
    }

    public boolean hasCurrentFilesize() {
        return hasFieldNumber(67);
    }

    public boolean hasDetailErrorCode() {
        return hasFieldNumber(64);
    }

    public boolean hasDetailErrorMsg() {
        return hasFieldNumber(68);
    }

    public boolean hasDetailErrorType() {
        return hasFieldNumber(63);
    }

    public boolean hasDnsCostMs() {
        return hasFieldNumber(42);
    }

    public boolean hasEnQueueTime() {
        return hasFieldNumber(15);
    }

    public boolean hasEndTime() {
        return hasFieldNumber(17);
    }

    public boolean hasErrorCode() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFileSize() {
        return hasFieldNumber(5);
    }

    public boolean hasFileid() {
        return hasFieldNumber(6);
    }

    public boolean hasFilekey() {
        return hasFieldNumber(3);
    }

    public boolean hasFilemd5() {
        return hasFieldNumber(9);
    }

    public boolean hasFiletype() {
        return hasFieldNumber(2);
    }

    public boolean hasFirstConnectCost() {
        return hasFieldNumber(24);
    }

    public boolean hasFirstRequestCompleted() {
        return hasFieldNumber(21);
    }

    public boolean hasFirstRequestCost() {
        return hasFieldNumber(18);
    }

    public boolean hasFirstRequestDownloadSize() {
        return hasFieldNumber(20);
    }

    public boolean hasFirstRequestSize() {
        return hasFieldNumber(19);
    }

    public boolean hasHttpResponseHeader() {
        return hasFieldNumber(40);
    }

    public boolean hasHttpStatusCode() {
        return hasFieldNumber(39);
    }

    public boolean hasIsResumed() {
        return hasFieldNumber(56);
    }

    public boolean hasIsSnsImageProtocolAvailable() {
        return hasFieldNumber(57);
    }

    public boolean hasLastNettype() {
        return hasFieldNumber(55);
    }

    public boolean hasLastSvrport() {
        return hasFieldNumber(54);
    }

    public boolean hasMoovCompleted() {
        return hasFieldNumber(30);
    }

    public boolean hasMoovCost() {
        return hasFieldNumber(28);
    }

    public boolean hasMoovFailReason() {
        return hasFieldNumber(31);
    }

    public boolean hasMoovRequestTimes() {
        return hasFieldNumber(27);
    }

    public boolean hasMoovSize() {
        return hasFieldNumber(29);
    }

    public boolean hasNetConnectTimes() {
        return hasFieldNumber(25);
    }

    public boolean hasOriVideoFormat() {
        return hasFieldNumber(11);
    }

    public boolean hasPicCachePath() {
        return hasFieldNumber(59);
    }

    public boolean hasPicIndex() {
        return hasFieldNumber(58);
    }

    public boolean hasPreviousCompletedSize() {
        return hasFieldNumber(32);
    }

    public boolean hasPrivateProtocol() {
        return hasFieldNumber(52);
    }

    public boolean hasProfile() {
        return hasFieldNumber(81);
    }

    public boolean hasQueueWaitCostMs() {
        return hasFieldNumber(43);
    }

    public boolean hasRealUsedUrl() {
        return hasFieldNumber(41);
    }

    public boolean hasRecvedBytes() {
        return hasFieldNumber(14);
    }

    public boolean hasRecvedVideoFormat() {
        return hasFieldNumber(12);
    }

    public boolean hasRequestCompletedCount() {
        return hasFieldNumber(36);
    }

    public boolean hasRequestTimeoutCount() {
        return hasFieldNumber(37);
    }

    public boolean hasRequestTotalCount() {
        return hasFieldNumber(35);
    }

    public boolean hasResponseAllCostMs() {
        return hasFieldNumber(46);
    }

    public boolean hasResponseWaitCostMs() {
        return hasFieldNumber(45);
    }

    public boolean hasServerIp() {
        return hasFieldNumber(48);
    }

    public boolean hasSnsvideoProfile() {
        return hasFieldNumber(78);
    }

    public boolean hasSpVideoinfo() {
        return hasFieldNumber(79);
    }

    public boolean hasStartTime() {
        return hasFieldNumber(16);
    }

    public boolean hasSvrFallbackCount() {
        return hasFieldNumber(38);
    }

    public boolean hasTaskStartTime() {
        return hasFieldNumber(73);
    }

    public boolean hasTraceId() {
        return hasFieldNumber(80);
    }

    public boolean hasTraceMsg() {
        return hasFieldNumber(8);
    }

    public boolean hasTransforMsg() {
        return hasFieldNumber(7);
    }

    public boolean hasTransportProtocol() {
        return hasFieldNumber(69);
    }

    public boolean hasTransportProtocolError() {
        return hasFieldNumber(70);
    }

    public boolean hasTrywriteBytes() {
        return hasFieldNumber(65);
    }

    public boolean hasVUsedIp() {
        return hasFieldNumber(53);
    }

    public boolean hasVideoCdnMsg() {
        return hasFieldNumber(13);
    }

    public boolean hasVideoFormat() {
        return hasFieldNumber(10);
    }

    public boolean hasXerrno() {
        return hasFieldNumber(49);
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.network.IlinkC2CDownloadOriginResult();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.f(1, this.error_code);
            }
            if (this.hasSetFields[2]) {
                fVar.f(2, this.filetype);
            }
            java.lang.String str = this.filekey;
            if (str != null && this.hasSetFields[3]) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.arg_info;
            if (gVar != null && this.hasSetFields[4]) {
                fVar.b(4, gVar);
            }
            if (this.hasSetFields[5]) {
                fVar.h(5, this.file_size);
            }
            com.tencent.mm.protobuf.g gVar2 = this.fileid;
            if (gVar2 != null && this.hasSetFields[6]) {
                fVar.b(6, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.transfor_msg;
            if (gVar3 != null && this.hasSetFields[7]) {
                fVar.b(7, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.trace_msg;
            if (gVar4 != null && this.hasSetFields[8]) {
                fVar.b(8, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.filemd5;
            if (gVar5 != null && this.hasSetFields[9]) {
                fVar.b(9, gVar5);
            }
            if (this.hasSetFields[10]) {
                fVar.f(10, this.video_format);
            }
            if (this.hasSetFields[11]) {
                fVar.f(11, this.ori_video_format);
            }
            com.tencent.mm.protobuf.g gVar6 = this.recved_video_format;
            if (gVar6 != null && this.hasSetFields[12]) {
                fVar.b(12, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.video_cdn_msg;
            if (gVar7 != null && this.hasSetFields[13]) {
                fVar.b(13, gVar7);
            }
            if (this.hasSetFields[14]) {
                fVar.h(14, this.recvedBytes);
            }
            if (this.hasSetFields[15]) {
                fVar.h(15, this.enQueueTime);
            }
            if (this.hasSetFields[16]) {
                fVar.h(16, this.startTime);
            }
            if (this.hasSetFields[17]) {
                fVar.h(17, this.endTime);
            }
            if (this.hasSetFields[18]) {
                fVar.h(18, this.firstRequestCost);
            }
            if (this.hasSetFields[19]) {
                fVar.h(19, this.firstRequestSize);
            }
            if (this.hasSetFields[20]) {
                fVar.h(20, this.firstRequestDownloadSize);
            }
            if (this.hasSetFields[21]) {
                fVar.a(21, this.firstRequestCompleted);
            }
            if (this.hasSetFields[22]) {
                fVar.h(22, this.averageSpeed);
            }
            if (this.hasSetFields[23]) {
                fVar.h(23, this.averageConnectCost);
            }
            if (this.hasSetFields[24]) {
                fVar.h(24, this.firstConnectCost);
            }
            if (this.hasSetFields[25]) {
                fVar.f(25, this.netConnectTimes);
            }
            if (this.hasSetFields[26]) {
                fVar.f(26, this.averageRtt);
            }
            if (this.hasSetFields[27]) {
                fVar.f(27, this.moovRequestTimes);
            }
            if (this.hasSetFields[28]) {
                fVar.h(28, this.moovCost);
            }
            if (this.hasSetFields[29]) {
                fVar.h(29, this.moovSize);
            }
            if (this.hasSetFields[30]) {
                fVar.a(30, this.moovCompleted);
            }
            if (this.hasSetFields[31]) {
                fVar.f(31, this.moovFailReason);
            }
            if (this.hasSetFields[32]) {
                fVar.h(32, this.previousCompletedSize);
            }
            if (this.hasSetFields[33]) {
                fVar.h(33, this.averageRequestSize);
            }
            if (this.hasSetFields[34]) {
                fVar.h(34, this.averageRequestCost);
            }
            if (this.hasSetFields[35]) {
                fVar.f(35, this.requestTotalCount);
            }
            if (this.hasSetFields[36]) {
                fVar.f(36, this.requestCompletedCount);
            }
            if (this.hasSetFields[37]) {
                fVar.f(37, this.requestTimeoutCount);
            }
            if (this.hasSetFields[38]) {
                fVar.f(38, this.svrFallbackCount);
            }
            if (this.hasSetFields[39]) {
                fVar.f(39, this.httpStatusCode);
            }
            com.tencent.mm.protobuf.g gVar8 = this.httpResponseHeader;
            if (gVar8 != null && this.hasSetFields[40]) {
                fVar.b(40, gVar8);
            }
            com.tencent.mm.protobuf.g gVar9 = this.real_used_url;
            if (gVar9 != null && this.hasSetFields[41]) {
                fVar.b(41, gVar9);
            }
            if (this.hasSetFields[42]) {
                fVar.h(42, this.dns_cost_ms);
            }
            if (this.hasSetFields[43]) {
                fVar.h(43, this.queue_wait_cost_ms);
            }
            if (this.hasSetFields[44]) {
                fVar.h(44, this.connect_cost_ms);
            }
            if (this.hasSetFields[45]) {
                fVar.h(45, this.response_wait_cost_ms);
            }
            if (this.hasSetFields[46]) {
                fVar.h(46, this.response_all_cost_ms);
            }
            com.tencent.mm.protobuf.g gVar10 = this.client_ip;
            if (gVar10 != null && this.hasSetFields[47]) {
                fVar.b(47, gVar10);
            }
            com.tencent.mm.protobuf.g gVar11 = this.server_ip;
            if (gVar11 != null && this.hasSetFields[48]) {
                fVar.b(48, gVar11);
            }
            com.tencent.mm.protobuf.g gVar12 = this.xerrno;
            if (gVar12 != null && this.hasSetFields[49]) {
                fVar.b(49, gVar12);
            }
            if (this.hasSetFields[50]) {
                fVar.f(50, this.cseq_result);
            }
            if (this.hasSetFields[51]) {
                fVar.a(51, this.crossNet);
            }
            if (this.hasSetFields[52]) {
                fVar.a(52, this.private_protocol);
            }
            fVar.g(53, 6, this.vUsedIp);
            if (this.hasSetFields[54]) {
                fVar.f(54, this.last_svrport);
            }
            if (this.hasSetFields[55]) {
                fVar.f(55, this.last_nettype);
            }
            if (this.hasSetFields[56]) {
                fVar.a(56, this.is_resumed);
            }
            if (this.hasSetFields[57]) {
                fVar.a(57, this.is_sns_image_protocol_available);
            }
            if (this.hasSetFields[58]) {
                fVar.f(58, this.pic_index);
            }
            com.tencent.mm.protobuf.g gVar13 = this.pic_cache_path;
            if (gVar13 != null && this.hasSetFields[59]) {
                fVar.b(59, gVar13);
            }
            com.tencent.mm.protobuf.g gVar14 = this.batch_pic_feedid;
            if (gVar14 != null && this.hasSetFields[60]) {
                fVar.b(60, gVar14);
            }
            com.tencent.mm.protobuf.g gVar15 = this.batch_image_file_key;
            if (gVar15 != null && this.hasSetFields[61]) {
                fVar.b(61, gVar15);
            }
            fVar.g(62, 8, this.batch_image_need_retry);
            if (this.hasSetFields[63]) {
                fVar.f(63, this.detail_error_type);
            }
            if (this.hasSetFields[64]) {
                fVar.f(64, this.detail_error_code);
            }
            if (this.hasSetFields[65]) {
                fVar.h(65, this.trywrite_bytes);
            }
            if (this.hasSetFields[66]) {
                fVar.h(66, this.available_bytes);
            }
            if (this.hasSetFields[67]) {
                fVar.h(67, this.current_filesize);
            }
            com.tencent.mm.protobuf.g gVar16 = this.detail_error_msg;
            if (gVar16 != null && this.hasSetFields[68]) {
                fVar.b(68, gVar16);
            }
            if (this.hasSetFields[69]) {
                fVar.f(69, this.transport_protocol);
            }
            if (this.hasSetFields[70]) {
                fVar.f(70, this.transport_protocol_error);
            }
            if (this.hasSetFields[73]) {
                fVar.h(73, this.task_start_time);
            }
            if (this.hasSetFields[74]) {
                fVar.f(74, this.backup_offset);
            }
            if (this.hasSetFields[75]) {
                fVar.f(75, this.backup_length);
            }
            fVar.g(76, 6, this.backup_listdata);
            fVar.g(77, 8, this.backup_listmeta);
            com.tencent.ilink.network.IlinkC2CSNSVideoProfile ilinkC2CSNSVideoProfile = this.snsvideo_profile;
            if (ilinkC2CSNSVideoProfile != null && this.hasSetFields[78]) {
                fVar.i(78, ilinkC2CSNSVideoProfile.computeSize());
                this.snsvideo_profile.writeFields(fVar);
            }
            com.tencent.ilink.network.IlinkC2CVideoInfo ilinkC2CVideoInfo = this.sp_videoinfo;
            if (ilinkC2CVideoInfo != null && this.hasSetFields[79]) {
                fVar.i(79, ilinkC2CVideoInfo.computeSize());
                this.sp_videoinfo.writeFields(fVar);
            }
            if (this.hasSetFields[80]) {
                fVar.h(80, this.trace_id);
            }
            com.tencent.mm.protobuf.g gVar17 = this.profile;
            if (gVar17 != null && this.hasSetFields[81]) {
                fVar.b(81, gVar17);
            }
            return 0;
        }
        if (i17 == 1) {
            int f17 = this.hasSetFields[1] ? b36.f.f(1, this.error_code) + 0 : 0;
            if (this.hasSetFields[2]) {
                f17 += b36.f.f(2, this.filetype);
            }
            java.lang.String str2 = this.filekey;
            if (str2 != null && this.hasSetFields[3]) {
                f17 += b36.f.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar18 = this.arg_info;
            if (gVar18 != null && this.hasSetFields[4]) {
                f17 += b36.f.b(4, gVar18);
            }
            if (this.hasSetFields[5]) {
                f17 += b36.f.h(5, this.file_size);
            }
            com.tencent.mm.protobuf.g gVar19 = this.fileid;
            if (gVar19 != null && this.hasSetFields[6]) {
                f17 += b36.f.b(6, gVar19);
            }
            com.tencent.mm.protobuf.g gVar20 = this.transfor_msg;
            if (gVar20 != null && this.hasSetFields[7]) {
                f17 += b36.f.b(7, gVar20);
            }
            com.tencent.mm.protobuf.g gVar21 = this.trace_msg;
            if (gVar21 != null && this.hasSetFields[8]) {
                f17 += b36.f.b(8, gVar21);
            }
            com.tencent.mm.protobuf.g gVar22 = this.filemd5;
            if (gVar22 != null && this.hasSetFields[9]) {
                f17 += b36.f.b(9, gVar22);
            }
            if (this.hasSetFields[10]) {
                f17 += b36.f.f(10, this.video_format);
            }
            if (this.hasSetFields[11]) {
                f17 += b36.f.f(11, this.ori_video_format);
            }
            com.tencent.mm.protobuf.g gVar23 = this.recved_video_format;
            if (gVar23 != null && this.hasSetFields[12]) {
                f17 += b36.f.b(12, gVar23);
            }
            com.tencent.mm.protobuf.g gVar24 = this.video_cdn_msg;
            if (gVar24 != null && this.hasSetFields[13]) {
                f17 += b36.f.b(13, gVar24);
            }
            if (this.hasSetFields[14]) {
                f17 += b36.f.h(14, this.recvedBytes);
            }
            if (this.hasSetFields[15]) {
                f17 += b36.f.h(15, this.enQueueTime);
            }
            if (this.hasSetFields[16]) {
                f17 += b36.f.h(16, this.startTime);
            }
            if (this.hasSetFields[17]) {
                f17 += b36.f.h(17, this.endTime);
            }
            if (this.hasSetFields[18]) {
                f17 += b36.f.h(18, this.firstRequestCost);
            }
            if (this.hasSetFields[19]) {
                f17 += b36.f.h(19, this.firstRequestSize);
            }
            if (this.hasSetFields[20]) {
                f17 += b36.f.h(20, this.firstRequestDownloadSize);
            }
            if (this.hasSetFields[21]) {
                f17 += b36.f.a(21, this.firstRequestCompleted);
            }
            if (this.hasSetFields[22]) {
                f17 += b36.f.h(22, this.averageSpeed);
            }
            if (this.hasSetFields[23]) {
                f17 += b36.f.h(23, this.averageConnectCost);
            }
            if (this.hasSetFields[24]) {
                f17 += b36.f.h(24, this.firstConnectCost);
            }
            if (this.hasSetFields[25]) {
                f17 += b36.f.f(25, this.netConnectTimes);
            }
            if (this.hasSetFields[26]) {
                f17 += b36.f.f(26, this.averageRtt);
            }
            if (this.hasSetFields[27]) {
                f17 += b36.f.f(27, this.moovRequestTimes);
            }
            if (this.hasSetFields[28]) {
                f17 += b36.f.h(28, this.moovCost);
            }
            if (this.hasSetFields[29]) {
                f17 += b36.f.h(29, this.moovSize);
            }
            if (this.hasSetFields[30]) {
                f17 += b36.f.a(30, this.moovCompleted);
            }
            if (this.hasSetFields[31]) {
                f17 += b36.f.f(31, this.moovFailReason);
            }
            if (this.hasSetFields[32]) {
                f17 += b36.f.h(32, this.previousCompletedSize);
            }
            if (this.hasSetFields[33]) {
                f17 += b36.f.h(33, this.averageRequestSize);
            }
            if (this.hasSetFields[34]) {
                f17 += b36.f.h(34, this.averageRequestCost);
            }
            if (this.hasSetFields[35]) {
                f17 += b36.f.f(35, this.requestTotalCount);
            }
            if (this.hasSetFields[36]) {
                f17 += b36.f.f(36, this.requestCompletedCount);
            }
            if (this.hasSetFields[37]) {
                f17 += b36.f.f(37, this.requestTimeoutCount);
            }
            if (this.hasSetFields[38]) {
                f17 += b36.f.f(38, this.svrFallbackCount);
            }
            if (this.hasSetFields[39]) {
                f17 += b36.f.f(39, this.httpStatusCode);
            }
            com.tencent.mm.protobuf.g gVar25 = this.httpResponseHeader;
            if (gVar25 != null && this.hasSetFields[40]) {
                f17 += b36.f.b(40, gVar25);
            }
            com.tencent.mm.protobuf.g gVar26 = this.real_used_url;
            if (gVar26 != null && this.hasSetFields[41]) {
                f17 += b36.f.b(41, gVar26);
            }
            if (this.hasSetFields[42]) {
                f17 += b36.f.h(42, this.dns_cost_ms);
            }
            if (this.hasSetFields[43]) {
                f17 += b36.f.h(43, this.queue_wait_cost_ms);
            }
            if (this.hasSetFields[44]) {
                f17 += b36.f.h(44, this.connect_cost_ms);
            }
            if (this.hasSetFields[45]) {
                f17 += b36.f.h(45, this.response_wait_cost_ms);
            }
            if (this.hasSetFields[46]) {
                f17 += b36.f.h(46, this.response_all_cost_ms);
            }
            com.tencent.mm.protobuf.g gVar27 = this.client_ip;
            if (gVar27 != null && this.hasSetFields[47]) {
                f17 += b36.f.b(47, gVar27);
            }
            com.tencent.mm.protobuf.g gVar28 = this.server_ip;
            if (gVar28 != null && this.hasSetFields[48]) {
                f17 += b36.f.b(48, gVar28);
            }
            com.tencent.mm.protobuf.g gVar29 = this.xerrno;
            if (gVar29 != null && this.hasSetFields[49]) {
                f17 += b36.f.b(49, gVar29);
            }
            if (this.hasSetFields[50]) {
                f17 += b36.f.f(50, this.cseq_result);
            }
            if (this.hasSetFields[51]) {
                f17 += b36.f.a(51, this.crossNet);
            }
            if (this.hasSetFields[52]) {
                f17 += b36.f.a(52, this.private_protocol);
            }
            int g17 = f17 + b36.f.g(53, 6, this.vUsedIp);
            if (this.hasSetFields[54]) {
                g17 += b36.f.f(54, this.last_svrport);
            }
            if (this.hasSetFields[55]) {
                g17 += b36.f.f(55, this.last_nettype);
            }
            if (this.hasSetFields[56]) {
                g17 += b36.f.a(56, this.is_resumed);
            }
            if (this.hasSetFields[57]) {
                g17 += b36.f.a(57, this.is_sns_image_protocol_available);
            }
            if (this.hasSetFields[58]) {
                g17 += b36.f.f(58, this.pic_index);
            }
            com.tencent.mm.protobuf.g gVar30 = this.pic_cache_path;
            if (gVar30 != null && this.hasSetFields[59]) {
                g17 += b36.f.b(59, gVar30);
            }
            com.tencent.mm.protobuf.g gVar31 = this.batch_pic_feedid;
            if (gVar31 != null && this.hasSetFields[60]) {
                g17 += b36.f.b(60, gVar31);
            }
            com.tencent.mm.protobuf.g gVar32 = this.batch_image_file_key;
            if (gVar32 != null && this.hasSetFields[61]) {
                g17 += b36.f.b(61, gVar32);
            }
            int g18 = g17 + b36.f.g(62, 8, this.batch_image_need_retry);
            if (this.hasSetFields[63]) {
                g18 += b36.f.f(63, this.detail_error_type);
            }
            if (this.hasSetFields[64]) {
                g18 += b36.f.f(64, this.detail_error_code);
            }
            if (this.hasSetFields[65]) {
                g18 += b36.f.h(65, this.trywrite_bytes);
            }
            if (this.hasSetFields[66]) {
                g18 += b36.f.h(66, this.available_bytes);
            }
            if (this.hasSetFields[67]) {
                g18 += b36.f.h(67, this.current_filesize);
            }
            com.tencent.mm.protobuf.g gVar33 = this.detail_error_msg;
            if (gVar33 != null && this.hasSetFields[68]) {
                g18 += b36.f.b(68, gVar33);
            }
            if (this.hasSetFields[69]) {
                g18 += b36.f.f(69, this.transport_protocol);
            }
            if (this.hasSetFields[70]) {
                g18 += b36.f.f(70, this.transport_protocol_error);
            }
            if (this.hasSetFields[73]) {
                g18 += b36.f.h(73, this.task_start_time);
            }
            if (this.hasSetFields[74]) {
                g18 += b36.f.f(74, this.backup_offset);
            }
            if (this.hasSetFields[75]) {
                g18 += b36.f.f(75, this.backup_length);
            }
            int g19 = g18 + b36.f.g(76, 6, this.backup_listdata) + b36.f.g(77, 8, this.backup_listmeta);
            com.tencent.ilink.network.IlinkC2CSNSVideoProfile ilinkC2CSNSVideoProfile2 = this.snsvideo_profile;
            if (ilinkC2CSNSVideoProfile2 != null && this.hasSetFields[78]) {
                g19 += b36.f.i(78, ilinkC2CSNSVideoProfile2.computeSize());
            }
            com.tencent.ilink.network.IlinkC2CVideoInfo ilinkC2CVideoInfo2 = this.sp_videoinfo;
            if (ilinkC2CVideoInfo2 != null && this.hasSetFields[79]) {
                g19 += b36.f.i(79, ilinkC2CVideoInfo2.computeSize());
            }
            if (this.hasSetFields[80]) {
                g19 += b36.f.h(80, this.trace_id);
            }
            com.tencent.mm.protobuf.g gVar34 = this.profile;
            return (gVar34 == null || !this.hasSetFields[81]) ? g19 : g19 + b36.f.b(81, gVar34);
        }
        if (i17 == 2) {
            this.vUsedIp.clear();
            this.batch_image_need_retry.clear();
            this.backup_listdata.clear();
            this.backup_listmeta.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.error_code = aVar2.h(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.filetype = aVar2.h(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.filekey = aVar2.k(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.arg_info = aVar2.d(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.file_size = aVar2.i(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.fileid = aVar2.d(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.transfor_msg = aVar2.d(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.trace_msg = aVar2.d(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.filemd5 = aVar2.d(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.video_format = aVar2.h(intValue);
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.ori_video_format = aVar2.h(intValue);
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                this.recved_video_format = aVar2.d(intValue);
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                this.video_cdn_msg = aVar2.d(intValue);
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                this.recvedBytes = aVar2.i(intValue);
                this.hasSetFields[14] = true;
                return 0;
            case 15:
                this.enQueueTime = aVar2.i(intValue);
                this.hasSetFields[15] = true;
                return 0;
            case 16:
                this.startTime = aVar2.i(intValue);
                this.hasSetFields[16] = true;
                return 0;
            case 17:
                this.endTime = aVar2.i(intValue);
                this.hasSetFields[17] = true;
                return 0;
            case 18:
                this.firstRequestCost = aVar2.i(intValue);
                this.hasSetFields[18] = true;
                return 0;
            case 19:
                this.firstRequestSize = aVar2.i(intValue);
                this.hasSetFields[19] = true;
                return 0;
            case 20:
                this.firstRequestDownloadSize = aVar2.i(intValue);
                this.hasSetFields[20] = true;
                return 0;
            case 21:
                this.firstRequestCompleted = aVar2.c(intValue);
                this.hasSetFields[21] = true;
                return 0;
            case 22:
                this.averageSpeed = aVar2.i(intValue);
                this.hasSetFields[22] = true;
                return 0;
            case 23:
                this.averageConnectCost = aVar2.i(intValue);
                this.hasSetFields[23] = true;
                return 0;
            case 24:
                this.firstConnectCost = aVar2.i(intValue);
                this.hasSetFields[24] = true;
                return 0;
            case 25:
                this.netConnectTimes = aVar2.h(intValue);
                this.hasSetFields[25] = true;
                return 0;
            case 26:
                this.averageRtt = aVar2.h(intValue);
                this.hasSetFields[26] = true;
                return 0;
            case 27:
                this.moovRequestTimes = aVar2.h(intValue);
                this.hasSetFields[27] = true;
                return 0;
            case 28:
                this.moovCost = aVar2.i(intValue);
                this.hasSetFields[28] = true;
                return 0;
            case 29:
                this.moovSize = aVar2.i(intValue);
                this.hasSetFields[29] = true;
                return 0;
            case 30:
                this.moovCompleted = aVar2.c(intValue);
                this.hasSetFields[30] = true;
                return 0;
            case 31:
                this.moovFailReason = aVar2.h(intValue);
                this.hasSetFields[31] = true;
                return 0;
            case 32:
                this.previousCompletedSize = aVar2.i(intValue);
                this.hasSetFields[32] = true;
                return 0;
            case 33:
                this.averageRequestSize = aVar2.i(intValue);
                this.hasSetFields[33] = true;
                return 0;
            case 34:
                this.averageRequestCost = aVar2.i(intValue);
                this.hasSetFields[34] = true;
                return 0;
            case 35:
                this.requestTotalCount = aVar2.h(intValue);
                this.hasSetFields[35] = true;
                return 0;
            case 36:
                this.requestCompletedCount = aVar2.h(intValue);
                this.hasSetFields[36] = true;
                return 0;
            case 37:
                this.requestTimeoutCount = aVar2.h(intValue);
                this.hasSetFields[37] = true;
                return 0;
            case 38:
                this.svrFallbackCount = aVar2.h(intValue);
                this.hasSetFields[38] = true;
                return 0;
            case 39:
                this.httpStatusCode = aVar2.h(intValue);
                this.hasSetFields[39] = true;
                return 0;
            case 40:
                this.httpResponseHeader = aVar2.d(intValue);
                this.hasSetFields[40] = true;
                return 0;
            case 41:
                this.real_used_url = aVar2.d(intValue);
                this.hasSetFields[41] = true;
                return 0;
            case 42:
                this.dns_cost_ms = aVar2.i(intValue);
                this.hasSetFields[42] = true;
                return 0;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                this.queue_wait_cost_ms = aVar2.i(intValue);
                this.hasSetFields[43] = true;
                return 0;
            case 44:
                this.connect_cost_ms = aVar2.i(intValue);
                this.hasSetFields[44] = true;
                return 0;
            case 45:
                this.response_wait_cost_ms = aVar2.i(intValue);
                this.hasSetFields[45] = true;
                return 0;
            case 46:
                this.response_all_cost_ms = aVar2.i(intValue);
                this.hasSetFields[46] = true;
                return 0;
            case 47:
                this.client_ip = aVar2.d(intValue);
                this.hasSetFields[47] = true;
                return 0;
            case 48:
                this.server_ip = aVar2.d(intValue);
                this.hasSetFields[48] = true;
                return 0;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                this.xerrno = aVar2.d(intValue);
                this.hasSetFields[49] = true;
                return 0;
            case 50:
                this.cseq_result = aVar2.h(intValue);
                this.hasSetFields[50] = true;
                return 0;
            case 51:
                this.crossNet = aVar2.c(intValue);
                this.hasSetFields[51] = true;
                return 0;
            case 52:
                this.private_protocol = aVar2.c(intValue);
                this.hasSetFields[52] = true;
                return 0;
            case 53:
                this.vUsedIp.add(aVar2.d(intValue));
                this.hasSetFields[53] = true;
                return 0;
            case 54:
                this.last_svrport = aVar2.h(intValue);
                this.hasSetFields[54] = true;
                return 0;
            case 55:
                this.last_nettype = aVar2.h(intValue);
                this.hasSetFields[55] = true;
                return 0;
            case 56:
                this.is_resumed = aVar2.c(intValue);
                this.hasSetFields[56] = true;
                return 0;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                this.is_sns_image_protocol_available = aVar2.c(intValue);
                this.hasSetFields[57] = true;
                return 0;
            case 58:
                this.pic_index = aVar2.h(intValue);
                this.hasSetFields[58] = true;
                return 0;
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                this.pic_cache_path = aVar2.d(intValue);
                this.hasSetFields[59] = true;
                return 0;
            case 60:
                this.batch_pic_feedid = aVar2.d(intValue);
                this.hasSetFields[60] = true;
                return 0;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                this.batch_image_file_key = aVar2.d(intValue);
                this.hasSetFields[61] = true;
                return 0;
            case 62:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.ilink.network.IlinkC2CBatchSnsReqImageData ilinkC2CBatchSnsReqImageData = new com.tencent.ilink.network.IlinkC2CBatchSnsReqImageData();
                    if (bArr != null && bArr.length > 0) {
                        ilinkC2CBatchSnsReqImageData.parseFrom(bArr);
                    }
                    this.batch_image_need_retry.add(ilinkC2CBatchSnsReqImageData);
                }
                this.hasSetFields[62] = true;
                return 0;
            case 63:
                this.detail_error_type = aVar2.h(intValue);
                this.hasSetFields[63] = true;
                return 0;
            case 64:
                this.detail_error_code = aVar2.h(intValue);
                this.hasSetFields[64] = true;
                return 0;
            case 65:
                this.trywrite_bytes = aVar2.i(intValue);
                this.hasSetFields[65] = true;
                return 0;
            case 66:
                this.available_bytes = aVar2.i(intValue);
                this.hasSetFields[66] = true;
                return 0;
            case 67:
                this.current_filesize = aVar2.i(intValue);
                this.hasSetFields[67] = true;
                return 0;
            case 68:
                this.detail_error_msg = aVar2.d(intValue);
                this.hasSetFields[68] = true;
                return 0;
            case 69:
                this.transport_protocol = aVar2.h(intValue);
                this.hasSetFields[69] = true;
                return 0;
            case 70:
                this.transport_protocol_error = aVar2.h(intValue);
                this.hasSetFields[70] = true;
                return 0;
            case 71:
            case 72:
            default:
                return -1;
            case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
                this.task_start_time = aVar2.i(intValue);
                this.hasSetFields[73] = true;
                return 0;
            case 74:
                this.backup_offset = aVar2.h(intValue);
                this.hasSetFields[74] = true;
                return 0;
            case 75:
                this.backup_length = aVar2.h(intValue);
                this.hasSetFields[75] = true;
                return 0;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                this.backup_listdata.add(aVar2.d(intValue));
                this.hasSetFields[76] = true;
                return 0;
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.ilink.network.IlinkC2CTlvMeta ilinkC2CTlvMeta = new com.tencent.ilink.network.IlinkC2CTlvMeta();
                    if (bArr2 != null && bArr2.length > 0) {
                        ilinkC2CTlvMeta.parseFrom(bArr2);
                    }
                    this.backup_listmeta.add(ilinkC2CTlvMeta);
                }
                this.hasSetFields[77] = true;
                return 0;
            case qc1.u.CTRL_INDEX /* 78 */:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.ilink.network.IlinkC2CSNSVideoProfile ilinkC2CSNSVideoProfile3 = new com.tencent.ilink.network.IlinkC2CSNSVideoProfile();
                    if (bArr3 != null && bArr3.length > 0) {
                        ilinkC2CSNSVideoProfile3.parseFrom(bArr3);
                    }
                    this.snsvideo_profile = ilinkC2CSNSVideoProfile3;
                }
                this.hasSetFields[78] = true;
                return 0;
            case 79:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    com.tencent.ilink.network.IlinkC2CVideoInfo ilinkC2CVideoInfo3 = new com.tencent.ilink.network.IlinkC2CVideoInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        ilinkC2CVideoInfo3.parseFrom(bArr4);
                    }
                    this.sp_videoinfo = ilinkC2CVideoInfo3;
                }
                this.hasSetFields[79] = true;
                return 0;
            case 80:
                this.trace_id = aVar2.i(intValue);
                this.hasSetFields[80] = true;
                return 0;
            case 81:
                this.profile = aVar2.d(intValue);
                this.hasSetFields[81] = true;
                return 0;
        }
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setArgInfo(com.tencent.mm.protobuf.g gVar) {
        this.arg_info = gVar;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setAvailableBytes(long j17) {
        this.available_bytes = j17;
        this.hasSetFields[66] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setAverageConnectCost(long j17) {
        this.averageConnectCost = j17;
        this.hasSetFields[23] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setAverageRequestCost(long j17) {
        this.averageRequestCost = j17;
        this.hasSetFields[34] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setAverageRequestSize(long j17) {
        this.averageRequestSize = j17;
        this.hasSetFields[33] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setAverageRtt(int i17) {
        this.averageRtt = i17;
        this.hasSetFields[26] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setAverageSpeed(long j17) {
        this.averageSpeed = j17;
        this.hasSetFields[22] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setBackupLength(int i17) {
        this.backup_length = i17;
        this.hasSetFields[75] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setBackupListdata(java.util.LinkedList<com.tencent.mm.protobuf.g> linkedList) {
        this.backup_listdata = linkedList;
        this.hasSetFields[76] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setBackupListmeta(java.util.LinkedList<com.tencent.ilink.network.IlinkC2CTlvMeta> linkedList) {
        this.backup_listmeta = linkedList;
        this.hasSetFields[77] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setBackupOffset(int i17) {
        this.backup_offset = i17;
        this.hasSetFields[74] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setBatchImageFileKey(com.tencent.mm.protobuf.g gVar) {
        this.batch_image_file_key = gVar;
        this.hasSetFields[61] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setBatchImageNeedRetry(java.util.LinkedList<com.tencent.ilink.network.IlinkC2CBatchSnsReqImageData> linkedList) {
        this.batch_image_need_retry = linkedList;
        this.hasSetFields[62] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setBatchPicFeedid(com.tencent.mm.protobuf.g gVar) {
        this.batch_pic_feedid = gVar;
        this.hasSetFields[60] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setClientIp(com.tencent.mm.protobuf.g gVar) {
        this.client_ip = gVar;
        this.hasSetFields[47] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setConnectCostMs(long j17) {
        this.connect_cost_ms = j17;
        this.hasSetFields[44] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setCrossNet(boolean z17) {
        this.crossNet = z17;
        this.hasSetFields[51] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setCseqResult(int i17) {
        this.cseq_result = i17;
        this.hasSetFields[50] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setCurrentFilesize(long j17) {
        this.current_filesize = j17;
        this.hasSetFields[67] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setDetailErrorCode(int i17) {
        this.detail_error_code = i17;
        this.hasSetFields[64] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setDetailErrorMsg(com.tencent.mm.protobuf.g gVar) {
        this.detail_error_msg = gVar;
        this.hasSetFields[68] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setDetailErrorType(int i17) {
        this.detail_error_type = i17;
        this.hasSetFields[63] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setDnsCostMs(long j17) {
        this.dns_cost_ms = j17;
        this.hasSetFields[42] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setEnQueueTime(long j17) {
        this.enQueueTime = j17;
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setEndTime(long j17) {
        this.endTime = j17;
        this.hasSetFields[17] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setErrorCode(int i17) {
        this.error_code = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setFileSize(long j17) {
        this.file_size = j17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setFileid(com.tencent.mm.protobuf.g gVar) {
        this.fileid = gVar;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setFilekey(java.lang.String str) {
        this.filekey = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setFilemd5(com.tencent.mm.protobuf.g gVar) {
        this.filemd5 = gVar;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setFiletype(int i17) {
        this.filetype = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setFirstConnectCost(long j17) {
        this.firstConnectCost = j17;
        this.hasSetFields[24] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setFirstRequestCompleted(boolean z17) {
        this.firstRequestCompleted = z17;
        this.hasSetFields[21] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setFirstRequestCost(long j17) {
        this.firstRequestCost = j17;
        this.hasSetFields[18] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setFirstRequestDownloadSize(long j17) {
        this.firstRequestDownloadSize = j17;
        this.hasSetFields[20] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setFirstRequestSize(long j17) {
        this.firstRequestSize = j17;
        this.hasSetFields[19] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setHttpResponseHeader(com.tencent.mm.protobuf.g gVar) {
        this.httpResponseHeader = gVar;
        this.hasSetFields[40] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setHttpStatusCode(int i17) {
        this.httpStatusCode = i17;
        this.hasSetFields[39] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setIsResumed(boolean z17) {
        this.is_resumed = z17;
        this.hasSetFields[56] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setIsSnsImageProtocolAvailable(boolean z17) {
        this.is_sns_image_protocol_available = z17;
        this.hasSetFields[57] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setLastNettype(int i17) {
        this.last_nettype = i17;
        this.hasSetFields[55] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setLastSvrport(int i17) {
        this.last_svrport = i17;
        this.hasSetFields[54] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setMoovCompleted(boolean z17) {
        this.moovCompleted = z17;
        this.hasSetFields[30] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setMoovCost(long j17) {
        this.moovCost = j17;
        this.hasSetFields[28] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setMoovFailReason(int i17) {
        this.moovFailReason = i17;
        this.hasSetFields[31] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setMoovRequestTimes(int i17) {
        this.moovRequestTimes = i17;
        this.hasSetFields[27] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setMoovSize(long j17) {
        this.moovSize = j17;
        this.hasSetFields[29] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setNetConnectTimes(int i17) {
        this.netConnectTimes = i17;
        this.hasSetFields[25] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setOriVideoFormat(int i17) {
        this.ori_video_format = i17;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setPicCachePath(com.tencent.mm.protobuf.g gVar) {
        this.pic_cache_path = gVar;
        this.hasSetFields[59] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setPicIndex(int i17) {
        this.pic_index = i17;
        this.hasSetFields[58] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setPreviousCompletedSize(long j17) {
        this.previousCompletedSize = j17;
        this.hasSetFields[32] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setPrivateProtocol(boolean z17) {
        this.private_protocol = z17;
        this.hasSetFields[52] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setProfile(com.tencent.mm.protobuf.g gVar) {
        this.profile = gVar;
        this.hasSetFields[81] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setQueueWaitCostMs(long j17) {
        this.queue_wait_cost_ms = j17;
        this.hasSetFields[43] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setRealUsedUrl(com.tencent.mm.protobuf.g gVar) {
        this.real_used_url = gVar;
        this.hasSetFields[41] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setRecvedBytes(long j17) {
        this.recvedBytes = j17;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setRecvedVideoFormat(com.tencent.mm.protobuf.g gVar) {
        this.recved_video_format = gVar;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setRequestCompletedCount(int i17) {
        this.requestCompletedCount = i17;
        this.hasSetFields[36] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setRequestTimeoutCount(int i17) {
        this.requestTimeoutCount = i17;
        this.hasSetFields[37] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setRequestTotalCount(int i17) {
        this.requestTotalCount = i17;
        this.hasSetFields[35] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setResponseAllCostMs(long j17) {
        this.response_all_cost_ms = j17;
        this.hasSetFields[46] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setResponseWaitCostMs(long j17) {
        this.response_wait_cost_ms = j17;
        this.hasSetFields[45] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setServerIp(com.tencent.mm.protobuf.g gVar) {
        this.server_ip = gVar;
        this.hasSetFields[48] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setSnsvideoProfile(com.tencent.ilink.network.IlinkC2CSNSVideoProfile ilinkC2CSNSVideoProfile) {
        this.snsvideo_profile = ilinkC2CSNSVideoProfile;
        this.hasSetFields[78] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setSpVideoinfo(com.tencent.ilink.network.IlinkC2CVideoInfo ilinkC2CVideoInfo) {
        this.sp_videoinfo = ilinkC2CVideoInfo;
        this.hasSetFields[79] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setStartTime(long j17) {
        this.startTime = j17;
        this.hasSetFields[16] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setSvrFallbackCount(int i17) {
        this.svrFallbackCount = i17;
        this.hasSetFields[38] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setTaskStartTime(long j17) {
        this.task_start_time = j17;
        this.hasSetFields[73] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setTraceId(long j17) {
        this.trace_id = j17;
        this.hasSetFields[80] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setTraceMsg(com.tencent.mm.protobuf.g gVar) {
        this.trace_msg = gVar;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setTransforMsg(com.tencent.mm.protobuf.g gVar) {
        this.transfor_msg = gVar;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setTransportProtocol(int i17) {
        this.transport_protocol = i17;
        this.hasSetFields[69] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setTransportProtocolError(int i17) {
        this.transport_protocol_error = i17;
        this.hasSetFields[70] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setTrywriteBytes(long j17) {
        this.trywrite_bytes = j17;
        this.hasSetFields[65] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setVUsedIp(java.util.LinkedList<com.tencent.mm.protobuf.g> linkedList) {
        this.vUsedIp = linkedList;
        this.hasSetFields[53] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setVideoCdnMsg(com.tencent.mm.protobuf.g gVar) {
        this.video_cdn_msg = gVar;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setVideoFormat(int i17) {
        this.video_format = i17;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult setXerrno(com.tencent.mm.protobuf.g gVar) {
        this.xerrno = gVar;
        this.hasSetFields[49] = true;
        return this;
    }

    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.network.IlinkC2CDownloadOriginResult parseFrom(byte[] bArr) {
        return (com.tencent.ilink.network.IlinkC2CDownloadOriginResult) super.parseFrom(bArr);
    }
}
